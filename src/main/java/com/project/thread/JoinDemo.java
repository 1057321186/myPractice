package com.project.thread;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join(100);// 等待线程t终止的时间最长为 millis 毫秒
        System.out.println("end");
    }
}
