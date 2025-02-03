package com.ju.oop;

import com.ju.oop.classes.Electronic;
import com.ju.oop.classes.TV;

//추상클래스
// 1) 추상메소드를 한개이상 가지거나
// 2) abstract 로 선언된 클래스
public class opp_03 {
    public static void main(String[] args){

        // !!!추상클래스는 자체는 객체화 불가

        // 자식이 구현 후 -> 객체 생성 가능
        //Electronic electronic = new Electronic();

        // 업캐스팅 = 자식 클래스의 객체를 부모 클래스 타입으로 참조
        // 다형성을 활용하여 부모 클래스의 공통된 메소드(인터페이스)를 호출

        // Electronic 타입으로 제한되어 메소드, 필드만 접근 가능
        // 하지만 실제 객체는 TV 이므로 오버라이딩 객체가 실행됨 (다형성)
        Electronic electronic1 = new TV("LG", 1);
        Electronic electronic2 = new TV("Samsung", 1);

        TV tv = new TV("Hello",1);

        electronic1.turnOn();
        electronic2.turnOn();

        System.out.println(tv.getNo()); // 채널 변경 전

        tv.changeChennel(2);
        tv.turnOff();

        System.out.println(tv.getNo()); // 채널 변경 후


    }
}

