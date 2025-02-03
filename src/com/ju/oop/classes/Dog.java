package com.ju.oop.classes;

// 상속
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age); // 부모클래스 생성자
    }

    // 메서드 오버라이딩
    @Override
    public void soundAnimal() {
        System.out.println(getName() + "멍멍");
    }


}
