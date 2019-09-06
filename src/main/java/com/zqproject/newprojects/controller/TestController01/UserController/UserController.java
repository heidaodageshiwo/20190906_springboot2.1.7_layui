package com.zqproject.newprojects.controller.TestController01.UserController;

import com.zqproject.newprojects.model.User.Users;
import com.zqproject.newprojects.service.UserService.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //logback
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    //http://localhost:8080/newprojects/find
    /**
     * 根据id查询
     * @return
     */
    @RequestMapping(value = "/find")
    public Users index() {
       Users user= userService.selectByPrimaryKey(5);
        System.out.print(user);
        logger.debug("Test -> 记录debug日志");
        logger.info("Test -> 访问了index方法");
        logger.error("Test -> 记录error错误日志");
        return  user;
    }
    
    
    //http://localhost:8080/newprojects/delete?id=3
    /**
     * 根据id删除
     * @param id
     * @return
     */
    @RequestMapping(value="/delete")
    public String delete(String id) {
        int result = userService.deleteByPrimaryKey(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //http://localhost:8080/newprojects/insert?id=123&age=333
    /**
     * 新增
     * @param user
     * @return
     */
    @RequestMapping(value = "/insert")
    public String insert(Users user) {
        int result = userService.insert(user);
        if (result >= 1) {
            return "新增成功";
        } else {
            return "新增失败";
        }

    }
    //http://localhost:8080/newprojects/update?id=123&age=333555
    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping(value = "/update")
    public String update(Users user) {
        int result = userService.updateByPrimaryKey(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }


}
