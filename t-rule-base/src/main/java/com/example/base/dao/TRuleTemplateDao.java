package com.example.base.dao;

import com.example.base.model.TRuleTemplate;

public interface TRuleTemplateDao {
    int deleteByPrimaryKey(Long id);

    int insert(TRuleTemplate record);

    int insertSelective(TRuleTemplate record);

    TRuleTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRuleTemplate record);

    int updateByPrimaryKey(TRuleTemplate record);
}