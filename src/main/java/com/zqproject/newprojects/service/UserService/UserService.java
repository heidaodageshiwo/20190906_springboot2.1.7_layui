package com.zqproject.newprojects.service.UserService;


import com.zqproject.newprojects.dao.UserMapperDao.UsersMapper;
import com.zqproject.newprojects.model.User.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UsersMapper userMapper;

    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(Integer.valueOf(id));
    }

    public int insert(Users record) {
        return userMapper.insert(record);
    }


    public Users selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKey(Users record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
