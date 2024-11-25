package com.company.lambdaExpressions;

@FunctionalInterface
public interface WrapperString<E> {
    E wrap(E e) throws EmptyValueException;
}
