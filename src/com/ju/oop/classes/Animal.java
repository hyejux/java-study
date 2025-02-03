package com.ju.oop.classes;

// 동물 -> 고양이 , 강아지
public class Animal {
    private String name;
    private int age;

    public Animal() {};

    public Animal(String name,  int age){
        this.age = age;
        this.name = name;
    }

    public void soundAnimal() {
        System.out.println("동물의 울음소리");
    }

    public void soundAnimal(String sound) {
        System.out.println(sound + " : 울음소리");
    }

    public void soundAnimal(String sound, int times) {
        System.out.println(getName() + " : 울음소리 ");
        for (int i = 0 ; i < times; i++){
            System.out.println(sound);
        }

    }




    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
