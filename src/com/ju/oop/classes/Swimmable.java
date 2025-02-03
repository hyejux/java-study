package com.ju.oop.classes;

public interface Swimmable {

    void swim();

    // default 메서드 (충돌)
    default void defaultMethod() {
        System.out.println("디폴트 메서드! Swimmable... ");
    }

}
