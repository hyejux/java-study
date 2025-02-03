package com.ju.exceptions;

import java.util.Scanner;

class AgeException extends Exception { // 사용자 정의 exception
    public AgeException(String message) {
        super(message);
    }
}

public class exception03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("나이를 입력해주세요");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("반갑습니다.");
        }catch (AgeException e){
            System.out.println("에러 입니다." + e.getMessage());
        }finally {
            sc.close();  // Scanner 자원 해제
        }

    }

    public static void validateAge(int age) throws AgeException {
        if (age < 18  || age > 60) {
            throw new AgeException("나이는 18이상 60이하");
        }
    }
}
