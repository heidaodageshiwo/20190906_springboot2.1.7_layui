package com.zqproject.newprojects.controller.TestController01.testController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping(value = "/user")
    public String indexsss(){
        return "springssssssssssssssssssss";
    }
}
