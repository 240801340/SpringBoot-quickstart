package com.example.springbootquickstart.controller;

import com.example.springbootquickstart.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    测试响应数据
 */
@RestController
public class ResponseController {
    @RequestMapping("hellospring")
    public String hello(){
        System.out.println("Hello Spring Boot");
        return "hello Spring Boot";
    }

    @RequestMapping("/getadd")
    public Address getadd(){
        System.out.println("getadd success");
        Address add = new Address();
        add.setCity("foshan");
        add.setProvince("guangdon");
        return add;
    }

}
