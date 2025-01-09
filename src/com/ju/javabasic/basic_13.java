package com.ju.javabasic;

import java.util.Scanner;

public class basic_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 1개 팩토리얼! > ");
        int num = sc.nextInt();

        factorial(num);

        sc.close();
    }

    public static int factorial(int a){
        return a*a;
    }
}
