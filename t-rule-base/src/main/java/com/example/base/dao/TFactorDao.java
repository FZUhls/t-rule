package com.example.base.dao;

import com.example.base.model.TFactor;

public interface TFactorDao {
    int deleteByPrimaryKey(Long id);

    int insert(TFactor record);

    int insertSelective(TFactor record);

    TFactor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TFactor record);

    int updateByPrimaryKey(TFactor record);
}