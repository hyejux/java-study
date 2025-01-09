package com.ju.exceptions.try_catch_ex;

import java.util.Scanner;

public class try_catch_ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("나눗셈 프로그램");
            System.out.println("첫번째 숫자 입력 >> ");
            int num1 = sc.nextInt();
            System.out.println("두번째 숫자 입력 >> ");
            int num2 = sc.nextInt();
            System.out.println(num1 / num2);
        }catch(ArithmeticException e){
            // 0 으로 나눌때 오류
            System.out.println("오류:: 0으로 나눌 수 없음");
        }catch (Exception e){
            // 모든 예외 처리
            System.out.println("오류 ::" + e.getMessage());
        }finally {
            sc.close();
            System.out.println("프로그램 종료");
        }
    }
}
