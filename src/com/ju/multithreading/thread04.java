package com.ju.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread04 {
    public static void main(String[] args) {

        //ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(3); // 3개의 스레드로 작업 수행

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing task.");
            });
        }

        executorService.shutdown(); // 스레드 풀 종료
    }
}
