package com.ju.javabasic;

import java.util.Scanner;

public class basic_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 1개 팩토리얼! > ");
        int num = sc.nextInt();

        System.out.println(factorial(num));

        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) { // 종료 조건: 0! = 1, 1! = 1
            return 1;
        }
        return n * factorial(n - 1); // 재귀 호출
    }
}
