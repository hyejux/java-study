package com.ju.oop;

import com.ju.oop.classes.Animal;
import com.ju.oop.classes.Cat;
import com.ju.oop.classes.Dog;

//상속 + 다형성
public class oop_02 {
    public static void main(String[] args){

        // 상속
        Animal animal = new Animal("popo", 1);
        Animal dog = new Dog("happy", 10);
        Animal cat = new Cat("titi" , 2);

        // 오버로딩  (다형성)
        animal.soundAnimal("윙왕");
        animal.soundAnimal("윙왕", 3);

        // 오버라이딩 + 자신의 방식으로 재정의 (다형성)
        dog.soundAnimal();
        dog.soundAnimal("왈왈");
        cat.soundAnimal();



    }
}
