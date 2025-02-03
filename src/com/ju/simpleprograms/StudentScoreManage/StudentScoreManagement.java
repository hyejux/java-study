package com.ju.simpleprograms.StudentScoreManage;

import java.util.*;

public class StudentScoreManagement {
    public static void main(String[] args){

        Map<String, Integer> student = new HashMap<>();

        student.put("sumin", 70);
        student.put("minju", 30);
        student.put("monja", 20);


        System.out.println("-----------");

        String input = "참외, 과일, 홍시";

        Set<String> test = new HashSet<>(Arrays.asList(input.split(", ")));
        System.out.println(test);
        for (String word : test) {
            System.out.println(word);
        }

        Set<String> word = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            String name = sc.nextLine();
            if (name.equals("종료")) {
                System.out.println(word);
                return;
            } else {
                word.add(name);
            }
        }


    }
}
