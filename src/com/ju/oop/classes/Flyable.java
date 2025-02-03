package com.ju.oop.classes;

public interface Flyable {

    void fly();

    // default 메서드 (충돌)
    default void defaultMethod() {
        System.out.println("디폴트 메서드! Flyable... ");
    }
}
