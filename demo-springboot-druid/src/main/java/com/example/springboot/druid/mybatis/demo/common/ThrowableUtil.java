package com.example.springboot.druid.mybatis.demo.common;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class ThrowableUtil {
    private static final int DEFAULT_ROW_COUNT = 10;

    public ThrowableUtil() {
    }

    public static String getStackTrace(Throwable throwable) {
        return getStackTrace(throwable, 10);
    }

    private static String getStackTrace(Throwable throwable, int rowCount) {
        if (throwable == null) {
            return null;
        } else {
            Throwable cause = throwable;
            StringBuilder sb = new StringBuilder(throwable.getClass().getName());
            if (throwable.getMessage() != null) {
                sb.append(":\t" + throwable.getMessage() + "\n");
            } else {
                sb.append("\n");
            }

            for (int i = 0; i < rowCount && cause != null; ++i) {
                if (i > 0) {
                    sb.append("Caused by: " + cause.getClass().getName());
                    if (cause.getMessage() != null) {
                        sb.append(":\t" + cause.getMessage() + "\n");
                    } else {
                        sb.append("\n");
                    }
                }

                StackTraceElement[] trace = cause.getStackTrace();

                for (int j = 0; j < trace.length; ++j) {
                    sb.append("\tat " + trace[j] + "\n");
                }

                cause = cause.getCause();
            }

            return sb.toString();
        }
    }
}
