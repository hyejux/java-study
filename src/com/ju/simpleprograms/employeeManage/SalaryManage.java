package com.ju.simpleprograms.employeeManage;

public class SalaryManage {

    public static void main(String[] args){

        Employee hyeju = new Developer();
        hyeju.setSalary(300);

        Employee minsu = new Manager();
        minsu.setSalary(300);

        System.out.println(hyeju.getPosition());
        System.out.println(minsu.getPosition());

        System.out.println(hyeju.getSalary());
        System.out.println(minsu.getSalary());

    }





}
