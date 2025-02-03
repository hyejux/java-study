package com.ju.oop.classes;

// 추상 클래스
public abstract class Electronic {

    // protected
    protected String name;
    protected int no;

    public Electronic(){

    }

    public Electronic(String name, int no){
        this.name = name;
        this.no = no;
    }

    //abstract 키워드 + 원형만 선언 (메소드의 헤더만 있음)
    // 추상 메서드가 있으면 무조건 추상 클래스로 선언
    public abstract void turnOn();
    public abstract void turnOff();

    public void showStatus(){
        System.out.println(name+"상태확인중...");
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
