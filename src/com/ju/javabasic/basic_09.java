package com.ju.javabasic;

import java.util.Scanner;

public class basic_09 {
    public static void main(String[] args){
        // 세가지 숫자 중 큰 숫자 찾기
        Scanner sc = new Scanner(System.in);

        System.out.println("젤 큰 수를 알려드립니다.");
        System.out.println("숫자 3개 입력해주세요 > ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = 0;

        if (num1 >= num2) {
            if (num1 > num3) {
                max = num1;
            } else if (num3 > num1) {
                max = num3;
            }else {
                max = num1;
            }
        } else if (num2 >= num1) {
            if(num2 > num3) {
                max = num2;
            }else if(num3 > num2){
                max = num3;
            }else {
                max = num2;
            }
        }

        System.out.println("최대값" + max);

        sc.close();
    }
}
