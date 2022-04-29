package com.example.base.dao;

import com.example.base.model.TIndicator;

public interface TIndicatorDao {
    int deleteByPrimaryKey(Long id);

    int insert(TIndicator record);

    int insertSelective(TIndicator record);

    TIndicator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TIndicator record);

    int updateByPrimaryKey(TIndicator record);
}