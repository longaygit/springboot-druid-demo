package com.example.springboot.druid.mybatis.demo.common;

public interface ServiceCode extends ResultCode {
    default ServiceException failure() {
        return new ServiceException(this);
    }

    default ServiceException failure(Throwable cause) {
        return new ServiceException(this, cause);
    }
}