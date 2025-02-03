package com.ju.simpleprograms.employeeManage;

public class Developer extends Employee{

    public Developer() {
        super("","","Developer");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary + 500); // 개발자는 500원
    }
}
