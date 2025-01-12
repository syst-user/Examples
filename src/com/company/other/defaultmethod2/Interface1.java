package com.company.other.defaultmethod2;

public interface Interface1 {
    default void commonMethod() {
        System.out.println("Interface1 commonMethod");
    }
}
