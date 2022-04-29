package com.example.base.dao;

import com.example.base.model.TMetaIndicator;

public interface TMetaIndicatorDao {
    int deleteByPrimaryKey(Long id);

    int insert(TMetaIndicator record);

    int insertSelective(TMetaIndicator record);

    TMetaIndicator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TMetaIndicator record);

    int updateByPrimaryKey(TMetaIndicator record);
}