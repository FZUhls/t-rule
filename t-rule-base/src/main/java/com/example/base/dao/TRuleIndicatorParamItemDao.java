package com.example.base.dao;

import com.example.base.model.TRuleIndicatorParamItem;

public interface TRuleIndicatorParamItemDao {
    int deleteByPrimaryKey(Long id);

    int insert(TRuleIndicatorParamItem record);

    int insertSelective(TRuleIndicatorParamItem record);

    TRuleIndicatorParamItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRuleIndicatorParamItem record);

    int updateByPrimaryKey(TRuleIndicatorParamItem record);
}