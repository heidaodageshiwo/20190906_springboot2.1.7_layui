package com.zqproject.newprojects.controller.LayuitestController;

import com.alibaba.fastjson.JSONObject;
import com.zqproject.newprojects.model.User.tbl_user;
import com.zqproject.newprojects.service.UserService.TblUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping
public class LayuitestsController {
    @Autowired
    private TblUserService tblUserService;
//    http://localhost:8080/newprojects/layuitest01
    @GetMapping("/layuitest01")
    public String layuitest01() {
        return "layui_test2019/layuitest01";
    }
//    http://localhost:8080/newprojects/layui_table

    @RequestMapping("/layui_table")
    public String layui_table() {
        System.out.println("11111");
        return "layui_table";
    }
//    http://localhost:8080/newprojects/return_table?page=1&limit=10
    @RequestMapping("/returntable")
    @ResponseBody
    public String return_table(@PathParam(value = "page") Integer page, @PathParam(value = "limit") Integer limit) {
        Integer beforeNum = (page - 1) * limit;

        // 获取选择分页内容
        List<tbl_user> miMessages = tblUserService.getAllMess(  beforeNum, limit);
        // 获取总数
        int count = tblUserService.getAllMess(  null, null).size();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        jsonObject.put("count", count);
        jsonObject.put("data", miMessages);
        return jsonObject.toJSONString();
       /*  测试数据专用 JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        jsonObject.put("count", "1");
        List s=new ArrayList();
        Map map=new HashMap();
//        map.put("id","1");
        map.put("username","1");
        map.put("sex","1");
        map.put("city","2");
        map.put("sign","3");
        map.put("experience","4");
        map.put("logins","5");
        map.put("wealth","5");
        map.put("classify","5");
        map.put("score","6");
        s.add(map);
        jsonObject.put("data", s);
        return jsonObject.toJSONString();*/

    }


}
