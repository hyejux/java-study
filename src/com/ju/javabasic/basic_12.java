package com.ju.javabasic;

import java.util.Scanner;

public class basic_12 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        basic_12 bs = new basic_12();

        System.out.println("숫자 2개 더하기 (메서드호출) > ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum1(a,b));
        System.out.println(bs.sum2(a,b));


        sc.close();
    }

    public static int sum1(int a, int b){
        return a+b;
    }

    public int sum2(int a, int b){
        return a+b;
    }


}

