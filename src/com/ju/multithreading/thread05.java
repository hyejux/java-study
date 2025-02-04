package com.ju.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BankAccount {
    private int balance = 1000;

    // 입금
    // 동기화되어있음, 즉 한개의 스레드만 메서드 실행 가능 (lock 유지 시킴)
    public synchronized void deposit(int amount) {
        balance += amount;
    }

    // 출금
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // 잔액 확인
    public int getBalance() {
        return balance;
    }
}

public class thread05 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();


        // 작업을 수행할 객체 생성
        Runnable depositTask = () -> account.deposit(500); // 입금
        Runnable withdrawTask = () -> account.withdraw(300); //출금

        // 스레드 실행 2개의 스레드 사용 , 최대 2개의 작업이 동시에 실행됨

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //스레드 풀에 의해 2개씩 동시에 실행되며, 실행 순서는 예측할 수 없음 (OS의 스케줄링에 따라 달라짐).
        executorService.submit(depositTask);
        executorService.submit(withdrawTask);
        executorService.submit(withdrawTask);
        executorService.submit(depositTask);

        executorService.shutdown();
        // 스레드 풀 종료

        System.out.println("Final balance: " + account.getBalance());
    }
}
