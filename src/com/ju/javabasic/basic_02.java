package com.ju.javabasic;

import java.util.Scanner;

public class basic_02 {
    public static void main(String[] args){
        // 간단한 계산기
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("---- 간단한 계산기 ----- ");
        System.out.println("원하는 숫자를 입력해주세요 > ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println( "결과 : "  + (a+b));

        sc.close();
    }
}
