package com.ju.javabasic;

import java.util.Scanner;

public class basic_05 {
    static final double FI = 3.141592;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력해주세요 ^^");
        int r = sc.nextInt();

        System.out.println(r*r*FI);
        System.out.println(Math.pow(r,2) * FI);

        sc.close();
    }
}
