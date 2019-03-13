package com.baizhi.dao;

import com.baizhi.entity.TelBook;

public interface TelBookMapper {
    int deleteByPrimaryKey(String id);

    int insert(TelBook record);

    int insertSelective(TelBook record);

    TelBook selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TelBook record);

    int updateByPrimaryKey(TelBook record);
}