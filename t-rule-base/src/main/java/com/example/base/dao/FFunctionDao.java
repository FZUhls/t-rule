package com.example.base.dao;

import com.example.base.model.FFunction;

public interface FFunctionDao {
    int deleteByPrimaryKey(Long id);

    int insert(FFunction record);

    int insertSelective(FFunction record);

    FFunction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FFunction record);

    int updateByPrimaryKey(FFunction record);
}