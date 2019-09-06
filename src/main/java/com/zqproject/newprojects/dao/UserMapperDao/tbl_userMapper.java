package com.zqproject.newprojects.dao.UserMapperDao;

import com.github.pagehelper.Page;
import com.zqproject.newprojects.model.User.tbl_user;

import java.util.List;

public interface tbl_userMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(tbl_user record);

    int insertSelective(tbl_user record);

    tbl_user selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(tbl_user record);

    int updateByPrimaryKey(tbl_user record);

    List<tbl_user> getUsers();

    Page<tbl_user> getUsers_page();
}