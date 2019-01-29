package com.example.springboot.druid.mybatis.demo.service;

import com.example.springboot.druid.mybatis.demo.mapper.UserMapper;
import com.example.springboot.druid.mybatis.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userInfoInterface")
public class UserInfoImpl implements UserInfoInterface {
    @Resource
    private UserMapper userMapper;

    @Override
    public String insertUser(User user) {
        int n = userMapper.insertUser(user);
        if (n > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public User findByNumber(Integer number) {
        return userMapper.findByNumber(number);
    }
}
