package com.zqproject.newprojects.dao.UserMapperDao;

import com.zqproject.newprojects.model.User.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}