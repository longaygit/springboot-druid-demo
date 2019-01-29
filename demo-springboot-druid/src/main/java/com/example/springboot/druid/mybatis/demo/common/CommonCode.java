package com.example.springboot.druid.mybatis.demo.common;

import java.util.List;

public enum CommonCode implements ServiceCode {
    INVALID_ARGS("1", "C", "参数无效"),
    DATA_NOT_FOUND("2", "C", "当前数据不存在"),
    NO_LOGIN("3", "C", "用户未登录"),
    INVALID_AUTH("4", "C", "权限无效"),
    RECORD_EXISTED("5", "C", "已经存在该记录"),
    ILLEGAL_STATE("6", "C", "无效的状态"),
    METHOD_NOT_ALLOWED("7", "C", "不支持的请求方法");

    private final String code;
    private final String message;

    private CommonCode(String code, String codeSign, String message) {
        this.code = codeSign + "_" + code;
        this.message = message;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public ServiceException failure() {
        return (ServiceException) (this == INVALID_ARGS ? new ServiceValidException(this) : new ServiceException(this));
    }

    public ServiceValidException invalid(List<Result.ViolationItem> violationItems) {
        return new ServiceValidException(violationItems);
    }
}

