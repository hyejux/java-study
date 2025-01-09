package com.ju.javabasic;

import java.util.Scanner;

public class basic_07 {
    public static void main(String[] args){
        // 짝수 홀수 판별기
        Scanner sc = new Scanner(System.in);
        System.out.println("짝수일까요 홀수일까요? > ");

        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.println("해당 숫자는 짝수입니다.");
        }else {
            System.out.println("해당 숫자는 홀수입니다.");
        }

        sc.close();
    }
}
