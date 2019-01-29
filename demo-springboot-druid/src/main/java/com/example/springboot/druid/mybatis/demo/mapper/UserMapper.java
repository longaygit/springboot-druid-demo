package com.example.springboot.druid.mybatis.demo.mapper;

import com.example.springboot.druid.mybatis.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    Integer insertUser(User user);

    User findByNumber(Integer number);
}
