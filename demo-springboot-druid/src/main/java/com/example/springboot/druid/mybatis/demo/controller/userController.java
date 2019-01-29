package com.example.springboot.druid.mybatis.demo.controller;

import com.example.springboot.druid.mybatis.demo.common.Result;
import com.example.springboot.druid.mybatis.demo.common.Results;
import com.example.springboot.druid.mybatis.demo.model.User;
import com.example.springboot.druid.mybatis.demo.service.UserInfoInterface;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/userInfo")
public class userController {
    @Resource
    private UserInfoInterface userInfoInterface;

    @PostMapping("/addUser")
    public Result<String> inserUser(@RequestBody User user) {
        return Results.success(userInfoInterface.insertUser(user));
    }

    @GetMapping("/getUser")
    public Result<User> getUser(Integer number) {
        return Results.success(userInfoInterface.findByNumber(number));
    }
}
