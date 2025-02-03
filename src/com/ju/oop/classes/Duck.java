package com.ju.oop.classes;

//인터페이스를 구현하는 클래스는 반드시 추상 메소드를 모두 구현
public class Duck implements Flyable, Swimmable{

    public Duck() {

    }

    @Override
    public void fly() {
        System.out.println("오리 날다..");
    }

    @Override
    public void swim() {
        System.out.println("오리 수영하다..");
    }

    @Override
    public void defaultMethod(){
        // 명시적으로 호출
        Flyable.super.defaultMethod();
        System.out.println("구현했어요 default");
    }

}
