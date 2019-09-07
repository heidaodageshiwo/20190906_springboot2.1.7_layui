package com.zqproject.newprojects.service.UserService;

import com.github.pagehelper.Page;
import com.zqproject.newprojects.dao.UserMapperDao.tbl_userMapper;
import com.zqproject.newprojects.model.User.tbl_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: newprojects
 * @Package: com.zqproject.newprojects.service.UserService
 * @ClassName: TblUserService
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2019-09-04 14:07
 * @UpdateUser: zhangq
 * @UpdateDate: 2019-09-04 14:07
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * *
 */
@Service
public class TblUserService {

    @Autowired
    private tbl_userMapper tbl_userMapper;
//    返回的只是数据，而总页数、当前页数、每页条数等分页相关的信息并没有返回。
    public   List<tbl_user> getUsers() {
        return tbl_userMapper.getUsers();
    }

    //    总页数、当前页数、每页条数等分页相关的信息 返回。
    public Page<tbl_user> getUsers_page() {
        return tbl_userMapper.getUsers_page();
    }

    /**
     * layui table表格数据分页展示
     * @param beforeNum
     * @param limitNum
     * @return
     */
    public List<tbl_user> getAllMess( Integer beforeNum, Integer limitNum) {
        return tbl_userMapper.getAllMess( beforeNum, limitNum);
    }

    /**
     * layui table表格查询总数
     * @return
     */
    public int selectCount() {
        return tbl_userMapper.selectCount();
    }
}
