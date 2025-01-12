package com.company.other.defaultmethod2;

public interface Interface2 {
    default void commonMethod() {
        System.out.println("Interface2 commonMethod");
    }
}
