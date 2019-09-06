package com.zqproject.newprojects;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@EnableSwagger2
@SpringBootApplication
//扫描com.zqproject.newprojects.dao包下的mapper文件
@MapperScan("com.zqproject.newprojects.dao")
public class NewprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewprojectsApplication.class, args);
	}

}
