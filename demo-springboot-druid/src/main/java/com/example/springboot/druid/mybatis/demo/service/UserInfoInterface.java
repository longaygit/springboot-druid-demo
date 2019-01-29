package com.example.springboot.druid.mybatis.demo.service;

import com.example.springboot.druid.mybatis.demo.model.User;

public interface UserInfoInterface {
    String insertUser(User user);

    User findByNumber(Integer number);
}
