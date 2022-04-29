package com.example.base.dao;

import com.example.base.model.TRuleTemplateFactorRelation;

public interface TRuleTemplateFactorRelationDao {
    int deleteByPrimaryKey(Long id);

    int insert(TRuleTemplateFactorRelation record);

    int insertSelective(TRuleTemplateFactorRelation record);

    TRuleTemplateFactorRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRuleTemplateFactorRelation record);

    int updateByPrimaryKey(TRuleTemplateFactorRelation record);
}