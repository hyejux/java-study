package com.ju.javabasic;

import java.util.Scanner;

public class basic_04 {
    public static void main(String[] args){

        // BMI 계산기
        Scanner sc = new Scanner(System.in);
        System.out.println("------ BMI 체질량 지수 계산기입니다 -------");
        System.out.println("키와 몸무게를 입력해주세요");
        System.out.print("키(cm) > ");
        double height = sc.nextInt();
        System.out.print("몸무게(kg) > ");
        double weight = sc.nextInt();

        double result = weight / Math.pow(height / 10.0 , 2) ;

        System.out.printf("%.2f %.3f \n" , result , result);

        String formatted = String.format("%.2f", result);

        System.out.println("당신의 BMI 는 " + formatted);

        sc.close();
    }
}
