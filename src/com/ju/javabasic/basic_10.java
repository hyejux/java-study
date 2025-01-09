package com.ju.javabasic;

import java.util.Scanner;

public class basic_10 {
    public static void main(String[] args){
        //구구단
        System.out.println("구구단을 외자!");
        Scanner sc = new Scanner(System.in);

        System.out.println("몇단을 외어볼까요? > ");
        int num = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }

        //구구단 9단 전부 출력
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.println(i + "*" + j + "=" + j*i);
            }
        }

        // 구구단 옆으로 출력
        //123456789

        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + "*" + i + "=" + j*i + " | ");
            }
            System.out.println();
        }


        sc.close();
    }
}
