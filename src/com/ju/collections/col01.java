package com.ju.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class col01 {
    public static void main(String[] args){
        List<String> student = new ArrayList<>();

        student.add("철수");
        student.add("영희");

        Scanner sc = new Scanner(System.in);

        System.out.println("추가할 학생 이름 >> ");
        String name = sc.next();
        student.add(name);

        System.out.println("삭제할 학생 이름 >> ");
        String delName = sc.next();
        student.remove(delName);

        System.out.println("모든 학생 출력 >> ");
        System.out.println(student);

        sc.close();
    }
}
