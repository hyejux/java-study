package com.ju.oop;

import com.ju.oop.classes.Bank;
import com.ju.oop.classes.Car;
import com.ju.oop.classes.Student;

// 객체 지향
public class opp_01 {
    public static void main(String[] args){


        // 캡슐화

        // 자동차 클래스

        Car car = new Car();

        car.speedUp(3);
        car.speedDown(1);

        System.out.println();

        // 학생 정보 관리
        Student student = new Student();
        student.setName("hyeju");
        student.setAge(25);
        student.setStudentNo(20201234);

        student.studentInfo();

        // 은행 출금

        Bank bank = new Bank();
        System.out.println("잔액 "+ bank.getBalance());
         bank.deposit(1000);
         bank.withdraw(500);
        System.out.println("잔액" + bank.getBalance());

    }
}
