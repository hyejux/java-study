package com.ju.javabasic;

import java.util.Scanner;

public class basic_11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //0 이상 1 미만의 실수를 반환
        int random = (int) (Math.random() * 10);

        while(true){
            System.out.println("번호 맞춰봐요 ! (1~10)사이임 ");
            int num = sc.nextInt();

            if(num == random){
                System.out.println("와 맞혔어요!");
                break;
            }else {
                System.out.println("틀렸어요.. 맞출때까지..");
            }

        }

        sc.close();
    }
}
