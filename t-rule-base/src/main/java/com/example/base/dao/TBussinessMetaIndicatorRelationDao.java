package com.example.base.dao;

import com.example.base.model.TBussinessMetaIndicatorRelation;

public interface TBussinessMetaIndicatorRelationDao {
    int deleteByPrimaryKey(Long id);

    int insert(TBussinessMetaIndicatorRelation record);

    int insertSelective(TBussinessMetaIndicatorRelation record);

    TBussinessMetaIndicatorRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBussinessMetaIndicatorRelation record);

    int updateByPrimaryKey(TBussinessMetaIndicatorRelation record);
}