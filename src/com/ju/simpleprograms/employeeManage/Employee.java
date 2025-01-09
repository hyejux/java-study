package com.ju.simpleprograms.employeeManage;

public class Employee {

    String id;
    String name;
    String position;

    public Employee() {

    }
    public Employee(String id, String name , String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setId(String id){
        this.id  = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPosition(String position){
        this.position = position;
    }

}
