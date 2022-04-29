package com.example.base.dao;

import com.example.base.model.TBusiness;

public interface TBusinessDao {
    int deleteByPrimaryKey(Long id);

    int insert(TBusiness record);

    int insertSelective(TBusiness record);

    TBusiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBusiness record);

    int updateByPrimaryKey(TBusiness record);
}