package com.company.lambdaExpressions;

@FunctionalInterface
public interface Wrapper<T> {
    String wrap(T t);
}
