package com.example.base.dao;

import com.example.base.model.TIndicatorParam;

public interface TIndicatorParamDao {
    int deleteByPrimaryKey(Long id);

    int insert(TIndicatorParam record);

    int insertSelective(TIndicatorParam record);

    TIndicatorParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TIndicatorParam record);

    int updateByPrimaryKey(TIndicatorParam record);
}