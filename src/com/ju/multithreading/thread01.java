package com.ju.multithreading;

// 스레드 상속
class MyThread extends Thread {
    @Override
    public void run() { // 오버라이딩
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}


public class thread01 {
    public static void main(String[] args){
        MyThread myThread = new MyThread();

        myThread.start(); // 스레드 시작
    }
}
