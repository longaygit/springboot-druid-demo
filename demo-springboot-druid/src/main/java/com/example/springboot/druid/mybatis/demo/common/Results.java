package com.example.springboot.druid.mybatis.demo.common;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.List;

public final class Results {
    public Results() {
    }

    public static Result<Void> success() {
        return (new DefaultResult()).setCode(SuccessCode.SUCCESS.code()).setMessage(SuccessCode.SUCCESS.message());
    }

    public static <T> Result<T> success(T data) {
        return (new DefaultResult()).setCode(SuccessCode.SUCCESS.code()).setMessage(SuccessCode.SUCCESS.message()).setData(data);
    }

    public static <T> Result<T> invalid() {
        return (new DefaultResult()).setCode(CommonCode.INVALID_ARGS.code()).setMessage(CommonCode.INVALID_ARGS.message());
    }

    public static <T> Result<T> invalid(String message) {
        return (new DefaultResult()).setCode(CommonCode.INVALID_ARGS.code()).setMessage(message);
    }

    public static <T> Result<T> invalid(String message, List<Result.ViolationItem> violationItems) {
        return (new DefaultResult()).setCode(CommonCode.INVALID_ARGS.code()).setMessage(message).setViolationItems(violationItems);
    }

    public static <T> Result<T> invalid(List<Result.ViolationItem> violationItems) {
        return (new DefaultResult()).setCode(CommonCode.INVALID_ARGS.code()).setMessage(CommonCode.INVALID_ARGS.message()).setViolationItems(violationItems);
    }

    public static <T> Result<T> failure(ServiceCode serviceCode) {
        return (new DefaultResult()).setCode(serviceCode.code()).setMessage(serviceCode.message());
    }

    public static <T> Result<T> failure(ServiceException serviceException) {
        return (new DefaultResult()).setCode(serviceException.getCode()).setMessage(serviceException.getMessage());
    }

    public static <T> Result<T> error(ServiceErrorException e) {
        return (new DefaultResult()).setCode(e.getCode()).setMessage(e.getMessage()).setErrorClass(e.getClass().getName()).setErrorStack(ThrowableUtil.getStackTrace(e));
    }

    public static <T> Result<T> error(Throwable throwable) {
        return (new DefaultResult()).setCode(ErrorCode.UNKNOWN_ERROR.code()).setMessage(ErrorCode.UNKNOWN_ERROR.message()).setErrorClass(throwable.getClass().getName()).setErrorStack(ThrowableUtil.getStackTrace(throwable));
    }

    public static <T> Result<T> error(ErrorCode errorCode, Throwable throwable) {
        return (new DefaultResult()).setCode(errorCode.code()).setMessage(errorCode.code()).setErrorClass(throwable.getClass().getName()).setErrorStack(ThrowableUtil.getStackTrace(throwable));
    }

    public static <T> Result<T> error(String code, String message, String errorClass) {
        return (new DefaultResult()).setCode(code).setMessage(message).setErrorClass(errorClass);
    }

    public static Result.ViolationItem buildViolationItem(String field, String message) {
        return new DefaultResult.DefaultVioationItem(field, message);
    }
}

