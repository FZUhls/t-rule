package com.example.base.dao;

import com.example.base.model.TRule;

public interface TRuleDao {
    int deleteByPrimaryKey(Long id);

    int insert(TRule record);

    int insertSelective(TRule record);

    TRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRule record);

    int updateByPrimaryKey(TRule record);
}