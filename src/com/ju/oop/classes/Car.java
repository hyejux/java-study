package com.ju.oop.classes;

public class Car {

    private String model;
    private int speed;

    public Car() {

    }

    public Car(String model , int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void speedUp(int speed){
        if(this.speed >= 0){
            this.speed += speed;
        }else {
            this.speed = 0;
        }

        System.out.println(speed + " 스피드 업!");
    }

    public void speedDown(int speed) {

        if(this.speed >= 0){
            this.speed -= speed;
        }else {
            this.speed = 0;
        }
        System.out.println(speed + " 스피드 다운!");
    }

}
