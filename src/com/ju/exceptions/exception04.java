package com.ju.exceptions;

import java.util.Scanner;

// 사용자 정의 예외 클래스
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}


public class exception04 {

    public static void main(String[] args){

        int balance = 300;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("출금 얼마 하시겠습니까?  > ");
            System.out.println("현재 잔액 " + balance);
            int amount = sc.nextInt();
            balance -= amount;
            checkSufficientFunds(balance); // 잔액 부족한지 확인 메서드

        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();  // Scanner 자원 해제
        }



    }


    // 잔액이 0 미만인지 확인하고 예외 처리
    // InsufficientFundsException 예외를 던질 수 있음을 명시
    // 즉, 예외가 발생할 수 있는 코드이므로 예외처리를 진행해줘야함.
    public static void checkSufficientFunds(int balance) throws InsufficientFundsException {
        if (balance < 0){
            throw new InsufficientFundsException("잔액이 부족합니다");
        }
    }

}
