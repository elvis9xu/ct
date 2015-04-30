package com.xjd.ct.biz.service;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.dao.ObjectDao;
import com.xjd.ct.dal.dao.SequenceDao;
import com.xjd.ct.dal.dos.ObjectModel;
import com.xjd.ct.dal.dos.ObjectResourceModel;
import com.xjd.ct.dal.dos.PublishModel;
import com.xjd.ct.dal.map.ObjectResourceModelMapper;
import com.xjd.ct.dal.map.PublishModelMapper;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.enums.ObjectTypeEnum;
import com.xjd.ct.utl.enums.ResForClassEnum;

/**
 * <pre>
 * 用户发表内容的管理
 * 1. 用户发表内容
 * 2. 用户编辑内容
 * 3. 用户删除内容
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 下午12:17:37
 */
@Service
public class PublishService {
	@Autowired
	SequenceDao sequenceDao;
	@Autowired
	PublishModelMapper publishModelMapper;
	@Autowired
	ObjectDao objectDao;
	@Autowired
	ObjectResourceModelMapper objectResourceModelMapper;

	@Transactional
	public void addPublish(Long userId, String publishTitle, String publishText, String resources) {
		PublishModel publishModel = new PublishModel();
		publishModel.setPublishId(sequenceDao.getSequence(SequenceDao.SEQ_PUBLISH_ID));
		publishModel.setUserId(userId);
		publishModel.setPublishTitle(publishTitle);
		publishModel.setPublishText(publishText);
		Date now = DateUtil.now();
		publishModel.setAddTime(now);
		publishModel.setUpdTime(now);
		publishModelMapper.insert(publishModel);

		ObjectModel objectModel = new ObjectModel();
		objectModel.setObjectId(sequenceDao.getSequence(SequenceDao.SEQ_OBJECT_ID));
		objectModel.setObjectType(ObjectTypeEnum.PUBLISH.getCode());
		objectModel.setObjectRefId(publishModel.getPublishId());
		objectModel.setVoteFlag(BoolEnum.FALSE.getCode());
		objectModel.setVoteMultiFlag(BoolEnum.FALSE.getCode());
		objectModel.setLikeYesFlag(BoolEnum.TRUE.getCode());
		objectModel.setLikeYesCount(0);
		objectModel.setLikeNoFlag(BoolEnum.FALSE.getCode());
		objectModel.setLikeNoCount(0);
		objectModel.setCommentFlag(BoolEnum.TRUE.getCode());
		objectModel.setCommentCount(0);
		objectModel.setFavorFlag(BoolEnum.TRUE.getCode());
		objectModel.setFavorCount(0);
		objectModel.setAddTime(now);
		objectModel.setUpdTime(now);
		objectDao.insert(objectModel);

		if (StringUtils.isNotEmpty(resources)) {
			String[] resourcesArray = resources.split(";");
			for (String resource : resourcesArray) {
				String[] resourceArray = resource.split(":");
				ObjectResourceModel objectResourceModel = new ObjectResourceModel();
				objectResourceModel.setResId(resourceArray[0]);
				objectResourceModel.setObjectType(ObjectTypeEnum.PUBLISH.getCode());
				objectResourceModel.setObjectRefId(publishModel.getPublishId());
				objectResourceModel.setForClass(ResForClassEnum.valueOfCode(Byte.valueOf(resourceArray[1])).getCode());
				objectResourceModel.setForSubclass(resourceArray.length > 2 ? resourceArray[2] : null);
				objectResourceModel.setFinishProcess(BoolEnum.FALSE.getCode());
				objectResourceModel.setAddTime(now);
				objectResourceModel.setUpdTime(now);
				objectResourceModelMapper.insert(objectResourceModel);
			}
		}
	}
}
