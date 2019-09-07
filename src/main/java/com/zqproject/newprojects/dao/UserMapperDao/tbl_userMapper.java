package com.zqproject.newprojects.dao.UserMapperDao;

import com.github.pagehelper.Page;
import com.zqproject.newprojects.model.User.tbl_user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface tbl_userMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(tbl_user record);

    int insertSelective(tbl_user record);

    tbl_user selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(tbl_user record);

    int updateByPrimaryKey(tbl_user record);

    /**
     * 没有添加pageHelper
     * @return
     */
    List<tbl_user> getUsers();

    /**
     * 分页pagehelper
     * @return
     */
    Page<tbl_user> getUsers_page();

    /**
     * 获取数据信息
     *
     * @return
     */
    List<tbl_user> getAllMess(@Param(value = "beforeNum") Integer beforeNum, @Param(value = "limitNum") Integer limitNum);

    /**
     * 获取总数
     *
     * @return
     */
    int selectCount();
}