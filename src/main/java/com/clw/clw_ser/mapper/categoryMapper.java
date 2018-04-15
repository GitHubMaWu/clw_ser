package com.clw.clw_ser.mapper;

import com.clw.clw_ser.model.category;

public interface categoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(category record);

    int insertSelective(category record);

    category selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(category record);

    int updateByPrimaryKey(category record);
}