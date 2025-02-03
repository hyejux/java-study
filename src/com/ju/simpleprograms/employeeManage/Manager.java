package com.ju.simpleprograms.employeeManage;

public class Manager extends Employee {

    public Manager() {
        super("","","Manager");
    }

    public Manager (String id, String name) {
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary + 1000); // 매니저는 1000원
    }
}
