package com.example.springboot.druid.mybatis.demo.common;

import java.util.ArrayList;
import java.util.List;

public class ServiceValidException extends ServiceException {
    private static final long serialVersionUID = 7725721546446842718L;
    private List<Result.ViolationItem> violationItems = new ArrayList();

    public ServiceValidException() {
        super(CommonCode.INVALID_ARGS);
    }

    public ServiceValidException(String message) {
        super(CommonCode.INVALID_ARGS.code(), message);
    }

    public ServiceValidException(String message, Throwable cause) {
        super(CommonCode.INVALID_ARGS.code(), message, cause);
    }

    public ServiceValidException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public ServiceValidException(String code, String message, List<Result.ViolationItem> violationItems) {
        super(code, message);
        this.violationItems = violationItems;
    }

    public ServiceValidException(List<Result.ViolationItem> violationItems) {
        super(CommonCode.INVALID_ARGS.code(), CommonCode.INVALID_ARGS.message());
        this.violationItems = violationItems;
    }

    public ServiceValidException(ServiceCode serviceCode) {
        super(serviceCode);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Result.ViolationItem> getViolationItems() {
        return this.violationItems;
    }

    public ServiceValidException addViolationItem(String field, String message) {
        if (this.violationItems == null) {
            this.violationItems = new ArrayList();
        }

        this.violationItems.add(Results.buildViolationItem(field, message));
        return this;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String toString() {
        return "ServiceValidException{code='" + this.code + '\'' + ", message='" + super.getMessage() + '\'' + ", violationItem=" + this.violationItems + '}';
    }
}

