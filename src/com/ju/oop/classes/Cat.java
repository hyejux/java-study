package com.ju.oop.classes;

public class Cat extends Animal{


    public Cat(String name ,int age){
        super(name, age);

    }

    @Override
    public void soundAnimal() {
        System.out.println(getName() + "냐옹");
    }
}
