package com.example.springboot.druid.mybatis.demo.common;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;

public interface Page<T> extends Serializable {
    int getPageNumber();

    int getPageSize();

    long getTotalCount();

    List<T> getResults();

    int getTotalPages();

    <S> Page<S> map(Function<? super T, ? extends S> converter);
}
