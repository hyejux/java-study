package com.ju.multithreading;

class Counter {
    private int count = 0;
    // 메서드 전체 동기화
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}


public class thread03 {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);

        thread1.setPriority(10); // Thread-1의 우선순위를 10으로 변경함.
        // 스레드의 우선순위가 가질 수 있는 범위는 1부터 10
        // 숫자가 높을수록 우선순위 또한 높아짐
        // 빨리 수행된다는 뜻이 아닌 좀 더 많이 실행 큐에 포함되어, 좀 더 많은 작업 시간을 할당된다는 뜻

        thread.start(); // 스레드 시작
        thread1.start();

        System.out.println(thread1.getPriority());

        System.out.println(thread.getPriority());
    }
}
