package com.example.springbootquickstart.controller;

import com.example.springbootquickstart.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello controller");
        return "hello world";
    }

    @RequestMapping("/simpleparam")
    public String simpleparam(@RequestParam(name = "name") String username, String age){
        System.out.println(username+" "+age);
        return "ok";
    }

    @RequestMapping("/simplepojo")
    public String simplepojo(User user){
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/arrayparam")
    public String arrayparam(String []hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    @RequestMapping("/listparam")
    public String arrayparam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "ok";
    }

    @RequestMapping("/dateparam")
    public String arrayparam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return "ok";
    }

    @RequestMapping("/jsonparam")
    public String arrayparam(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/path/{id}/{name}")
    public String arrayparam(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id+name);
        return "ok";
    }
}
