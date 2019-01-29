package com.example.springboot.druid.mybatis.demo.common;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DefaultResult<T> implements Result<T>, Serializable {
    private static final long serialVersionUID = -4408341719434417427L;
    private static final String SUCCESS_CODE = "0";
    private static final String UNKNOWN_ERROR = "1";
    private static final String ERROR_PREFIX = "SYS_";
    private String code;
    private String message;
    @Valid
    private T data;
    private String errorClass;
    private String errorStack;
    private List<ViolationItem> violationItems;

    public DefaultResult() {
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public List<ViolationItem> getViolationItems() {
        return this.violationItems;
    }

    public String getErrorClass() {
        return this.errorClass;
    }

    public String getErrorStack() {
        return this.errorStack;
    }

    public DefaultResult<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public DefaultResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public DefaultResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public DefaultResult<T> setViolationItems(List<ViolationItem> violationItems) {
        this.violationItems = violationItems;
        return this;
    }

    public DefaultResult<T> setErrorClass(String errorClass) {
        this.errorClass = errorClass;
        return this;
    }

    public DefaultResult<T> setErrorStack(String errorStack) {
        this.errorStack = errorStack;
        return this;
    }

    public DefaultResult<T> addViolationItem(String field, String message) {
        if (this.violationItems == null) {
            this.violationItems = new ArrayList();
        }

        this.violationItems.add(new DefaultResult.DefaultVioationItem(field, message));
        return this;
    }

    public boolean isSuccess() {
        return "0".equals(this.code);
    }

    public boolean isError() {
        return "1".equals(this.code) || this.code != null && this.code.startsWith("SYS_");
    }

    public boolean isFailure() {
        return !this.isSuccess() && !this.isError();
    }

    public String toString() {
        return "Result{code='" + this.code + '\'' + ", message='" + this.message + '\'' + ", data=" + this.data + ", errorClass='" + this.errorClass + '\'' + ", errorStack='" + this.errorStack + '\'' + ", violationItems=" + this.violationItems + '}';
    }

    public static class DefaultVioationItem implements ViolationItem, Serializable {
        private static final long serialVersionUID = 2803300694383082237L;
        private String field;
        private String message;

        public DefaultVioationItem() {
        }

        public DefaultVioationItem(String field, String message) {
            this.field = field;
            this.message = message;
        }

        public String getField() {
            return this.field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (o != null && this.getClass() == o.getClass()) {
                DefaultResult.DefaultVioationItem that = (DefaultResult.DefaultVioationItem) o;
                return this.field != null ? this.field.equals(that.field) : that.field == null;
            } else {
                return false;
            }
        }

        public int hashCode() {
            return this.field != null ? this.field.hashCode() : 0;
        }

        public String toString() {
            return "{field='" + this.field + '\'' + ", message='" + this.message + '\'' + '}';
        }
    }
}

