package com.ju.javabasic;

import java.util.Scanner;

public class basic_01 {
    public static void main(String[] args) {

        // 사용자 이름 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름은 ? >> ");
        String name = sc.next();
        System.out.println(name + "님 어서오세요");

        sc.close();
    }
}
