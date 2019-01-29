package com.example.springboot.druid.mybatis.demo.common;


import java.io.Serializable;
import java.util.List;

public interface Result<T> extends Serializable {
    String getCode();

    String getMessage();

    T getData();

    List<ViolationItem> getViolationItems();

    String getErrorClass();

    String getErrorStack();

    Result<T> setCode(String code);

    Result<T> setMessage(String message);

    Result<T> setData(T data);

    Result<T> setViolationItems(List<Result.ViolationItem> violationItems);

    Result<T> setErrorClass(String errorClass);

    Result<T> setErrorStack(String errorStack);

    Result<T> addViolationItem(String field, String message);

    boolean isSuccess();

    boolean isError();

    boolean isFailure();

    public interface ViolationItem extends Serializable {
        String getField();

        void setField(String field);

        String getMessage();

        void setMessage(String message);
    }
}

