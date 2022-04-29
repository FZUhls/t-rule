package com.example.base.dao;

import com.example.base.model.TRuleFactorValue;

public interface TRuleFactorValueDao {
    int deleteByPrimaryKey(Long id);

    int insert(TRuleFactorValue record);

    int insertSelective(TRuleFactorValue record);

    TRuleFactorValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRuleFactorValue record);

    int updateByPrimaryKey(TRuleFactorValue record);
}