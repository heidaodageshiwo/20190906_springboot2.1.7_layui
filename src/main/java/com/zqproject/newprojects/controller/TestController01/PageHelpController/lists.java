package com.zqproject.newprojects.controller.TestController01.PageHelpController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zqproject.newprojects.model.User.tbl_user;
import com.zqproject.newprojects.service.UserService.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: newprojects
 * @Package: com.zqproject.newprojects.controller.PageHelpController
 * @ClassName: lists
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2019-09-04 14:17
 * @UpdateUser: zhangq
 * @UpdateDate: 2019-09-04 14:17
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * *
 */
@RestController
public class lists {

    @Autowired
    private TblUserService tblUserService;

//    http://localhost:8080/newprojects/usersList?pageNo=1&pageSize=5   可以分页
//    浏览器输入http://localhost:8080/newprojects/usersList,这是因为没有传参数，后台取默认值，查询第一页的10条数据。
//返回[{"userId":4,"userName":"user1","userAge":21},{"userId":5,"userName":"user2","userAge":22},{"userId":6,"userName":"user3","userAge":23},{"userId":7,"userName":"user4","userAge":24},{"userId":8,"userName":"user5","userAge":25}]
    @RequestMapping(value = "/usersList")
    public List<tbl_user> listscc(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<tbl_user> lisc = tblUserService.getUsers();
        return lisc;
    }

    /**
     * http://localhost:8080/newprojects/usersListPage?pageNo=1&pageSize=5
     * http://localhost:8080/newprojects/usersListPage
     * @param pageNo
     * @param pageSize
     * @return
     */

    @RequestMapping(value = "/usersListPage")
    public PageInfo<tbl_user> usersListPage(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        PageInfo<tbl_user> pageInfo = new PageInfo<>(tblUserService.getUsers_page());
        System.out.println("2222222222222");
        return pageInfo;
    }
    //返回以下数据
   /* {
        "total":9,
            "list":[
        {
            "userId":4,
                "userName":"user1",
                "userAge":21
        },
        {
            "userId":5,
                "userName":"user2",
                "userAge":22
        },
        {
            "userId":6,
                "userName":"user3",
                "userAge":23
        },
        {
            "userId":7,
                "userName":"user4",
                "userAge":24
        },
        {
            "userId":8,
                "userName":"user5",
                "userAge":25
        }
    ],
        "pageNum":1,
            "pageSize":5,
            "size":5,
            "startRow":1,
            "endRow":5,
            "pages":2,
            "prePage":0,
            "nextPage":2,
            "isFirstPage":true,
            "isLastPage":false,
            "hasPreviousPage":false,
            "hasNextPage":true,
            "navigatePages":8,
            "navigatepageNums":[
        1,
                2
    ],
        "navigateFirstPage":1,
            "navigateLastPage":2
    }*/


}
