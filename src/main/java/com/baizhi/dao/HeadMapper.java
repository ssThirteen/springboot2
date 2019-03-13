package com.baizhi.dao;

import com.baizhi.entity.Head;

public interface HeadMapper {
    int deleteByPrimaryKey(String id);

    int insert(Head record);

    int insertSelective(Head record);

    Head selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Head record);

    int updateByPrimaryKey(Head record);
}