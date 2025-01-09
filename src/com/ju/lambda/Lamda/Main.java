package com.ju.lambda.Lamda;

public class Main {
    public static void main(String[] args) {
        // 기존 방식
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Runnable!(기존방식)");
            }
        };
        new Thread(runnable1).start();

        // 람다식
        Runnable runnable2 = () -> System.out.println("Hello from Runnable!(람다식)");
        new Thread(runnable2).start();

    }
}