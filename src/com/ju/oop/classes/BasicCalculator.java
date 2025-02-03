package com.ju.oop.classes;

public class BasicCalculator implements Calculator {


    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("0으로 나눌 수 없음");
        }
        return a/b;
    }
}
