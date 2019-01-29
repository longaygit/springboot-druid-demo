package com.example.springboot.druid.mybatis.demo.common;

public interface ResultCode {
    String SYS = "SYS";
    String COMMON = "C";
    String AUTH = "AUTH";

    String code();

    String message();
}