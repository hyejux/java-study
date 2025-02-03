package com.ju.oop.classes;

// 추상 클래스 구현 = 다형성
// 본체 만들기
public class TV extends Electronic {

    public TV(String name, int no){
        super(name, no);
    }

    public TV() {

    }

    //공통 기능
    @Override
    public void turnOn() {
        System.out.println(name + "TV켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println(name + "TV꺼짐");
    }

    //고유 기능
    public void changeChennel(int channel){
        setNo(channel);
        System.out.println(name+"채널이"+channel + "로 변경됨");
    }
}
