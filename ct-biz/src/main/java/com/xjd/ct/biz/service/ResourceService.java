package com.xjd.ct.biz.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StreamUtils;

import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.biz.util.BeanTansferUtil;
import com.xjd.ct.dal.dao.ResourceDao;
import com.xjd.ct.dal.dos.ResourceModel;
import com.xjd.ct.dal.dos.UserResourceRsModel;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.context.AppContext;
import com.xjd.ct.utl.enums.ResFormEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 资源管理
 * 1. 资源上传
 * 2. 资源下载
 * 3. 资源删除
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:11:21
 */
@Service
public class ResourceService {
	@Autowired
	ResourceDao resourceDao;

	@Transactional
	public ResourceBo upload(Long userId, File file, String format, String contentType) {
		String md5 = DigestUtil.md5(file);

		ResourceModel resourceModel = resourceDao.selectResourceByMd5AndFormat(md5, format);
		if (resourceModel == null) {
			resourceModel = new ResourceModel();
			resourceModel.setResId(generateResourceId());
			resourceModel.setResContentType(contentType);
			resourceModel.setResFormat(format);
			resourceModel.setResForm(ResFormEnum.FILE.getCode());
			resourceModel.setResPath(generateResourcePath(resourceModel.getResId(), md5, format));
			resourceModel.setResMd5(md5);
			Date now = DateUtil.now();
			resourceModel.setAddTime(now);
			resourceModel.setUpdTime(now);

			saveResourceFile(file, resourceModel.getResPath());
			resourceDao.insertResource(resourceModel);
		}

		UserResourceRsModel userResourceRsModel = resourceDao.selectUserResourceRsByUserIdAndResId(userId,
				resourceModel.getResId());
		if (userResourceRsModel == null) {
			userResourceRsModel = new UserResourceRsModel();
			userResourceRsModel.setUserId(userId);
			userResourceRsModel.setResId(resourceModel.getResId());
			userResourceRsModel.setAddTime(DateUtil.now());
			resourceDao.insertUserResourceRs(userResourceRsModel);
		}

		return BeanTansferUtil.transferResourceDoToResourceBo(resourceModel);
	}

	protected void saveResourceFile(File file, String resPath) {
		String resRoot = AppContext.getProperty(AppConstant.RESOURCE_ROOT_PATH_KEY);
		File resFile = new File(resRoot, resPath);

		File pFile = resFile.getParentFile();
		if (!pFile.isDirectory()) {
			pFile.mkdirs();
		}

		file.renameTo(resFile);
	}

	protected String generateResourceId() {
		return UUID.randomUUID().toString().toUpperCase().replace("-", "");
	}

	protected String generateResourcePath(String resId, String md5, String format) {
		String suffix = ".no";
		if (StringUtils.isNotBlank(format)) {
			suffix = "." + format;
		}

		String prefix = DateUtil.format(DateUtil.now(), DateUtil.PATTERN_YEAR2SECOND);

		return prefix + "_" + resId + "_" + md5 + suffix;
	}

	public ResourceBo queryResource(String resId) {
		ResourceModel resourceModel = resourceDao.selectResourceByResId(resId);
		return BeanTansferUtil.transferResourceDoToResourceBo(resourceModel);
	}

	public void download(String resId, OutputStream out) {
		ResourceModel resourceModel = resourceDao.selectResourceByResId(resId);
		if (resourceModel == null) {
			throw new BusinessException(RespCode.RESP_0221);
		}

		ResFormEnum resFormEnum = ResFormEnum.valueOfCode(resourceModel.getResForm());
		if (resFormEnum == ResFormEnum.FILE) {
			File resFile = new File(AppContext.getProperty(AppConstant.RESOURCE_ROOT_PATH_KEY),
					resourceModel.getResPath());
			FileInputStream in = null;
			try {
				in = new FileInputStream(resFile);
				StreamUtils.copy(in, out);
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						// DO NOTHING
					}
				}
			}
		} else if (resFormEnum == ResFormEnum.LINK) {
			// TODO
		}
	}
}
