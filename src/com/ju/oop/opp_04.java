package com.ju.oop;

import com.ju.oop.classes.BasicCalculator;
import com.ju.oop.classes.Calculator;
import com.ju.oop.classes.Duck;
import com.ju.oop.classes.Swimmable;

// interface 인터페이스
public class opp_04 {
    public static void main(String[] args){

        // 인터페이스 = 동작 규약 정의 및 강제!
        // 추상메소드와 상수를 포함할 수 있는 타입

        // 다중 상속 가능
        // 다중 구현 가능
        // 메소드, 필드가 public
        // 구현은 implementation
        Calculator calculator = new BasicCalculator();

        System.out.println("덧셈: " + calculator.add(10, 5));         // 출력: 15.0
        System.out.println("뺄셈: " + calculator.subtract(10, 5));  // 출력: 5.0
        System.out.println("곱셈: " + calculator.multiply(10, 5));  // 출력: 50.0
        System.out.println("나눗셈: " + calculator.divide(10, 5));  // 출력: 2.0

        Swimmable swimmable = new Duck();

        swimmable.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        // default 메서드 (충돌 = 다이아몬드문제) 시 명시적 선언
        swimmable.defaultMethod();
        duck.defaultMethod();

    }
}
