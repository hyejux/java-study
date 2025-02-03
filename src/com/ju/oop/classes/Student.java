package com.ju.oop.classes;

public class Student {
    private String name;
    private int age;
    private int studentNo;

    public Student() {

    }

    public Student(String name, int age, int studentNo){
        this.name = name;
        this.age = age;
        this.studentNo = studentNo;
    }

    // 이런식으로 생성자를 주면 같은 타입의 경우 초기화가 모호해진다.
    // => getter setter 이용하도록!
    public Student(String name){
        this.name = name;
    }

    //getter  setter
    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void studentInfo() {
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("studentNo" + studentNo);
    }
}
