package com.ju.oop.classes;

public class Bank {
    private double balance;

    public Bank(){}

    public Bank(double balance){
        if(balance < 0){
            this.balance = 0;
        }else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

   public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("입금 완료 :" + balance);
        }else {
            System.out.println("입금액은 0보다 커야합니다.");
        }
   }

   public void withdraw(double amount){
        if( amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " 출금 완료 ");
        } else if (amount <= balance){
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println(" 0 보다 큰 값을 입력해주세요");
        }
   }


}

