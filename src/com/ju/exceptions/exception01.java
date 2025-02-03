package com.ju.exceptions;

import java.util.Scanner;

public class exception01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double result = 0;
            result = a / b;
            System.out.println(result);
        }catch (ArithmeticException e){ // 0으로 나눌때 예외
            System.out.println("0으로 나눌 수 없습니다");
        }finally {
            sc.close();
            System.out.println("프로그램 종료");
        }




    }
}
