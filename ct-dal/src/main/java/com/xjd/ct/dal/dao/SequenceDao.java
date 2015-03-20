package com.xjd.ct.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjd.ct.dal.map.SequenceMapper;

/**
 * 序列管理Dao
 * 
 * @author elvis.xu
 * @since 2015-03-20 18:11
 */
@Repository
@Transactional
public class SequenceDao {

	public static final String SEQ_SERVICE_LOG_ID = "SEQ_SERVICE_LOG_ID";

	@Autowired
	SequenceMapper sequenceMapper;

	public Long getSequence(String seqName) {
		return sequenceMapper.getSequence(seqName);
	}
}
