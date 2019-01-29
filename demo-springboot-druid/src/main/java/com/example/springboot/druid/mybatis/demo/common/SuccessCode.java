package com.example.springboot.druid.mybatis.demo.common;

public enum SuccessCode implements ResultCode {
    SUCCESS("0", "成功!");

    private final String code;
    private final String message;

    private SuccessCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}

