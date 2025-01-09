package com.ju.javabasic;

import java.util.Scanner;

public class basic_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("두수 비교할게요");
        System.out.println("숫자 두개 입력해주세요 > ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("더 큰값 : "+ num1);
        }else if (num1 < num2) {
            System.out.println("더 큰값 : "+ num2);
        }else {
            System.out.println("값이 같습니다.");
        }
        sc.close();
    }
}
