package com.project.base;

public class Base {
    public static void main(String[] args) {


        // 执行Thread
        Thread test1 = new ThreadTest();
        Thread test2 = new ThreadTest();
        test1.start();
        test2.start();

        // 执行Runnable
        RunnableTest r  = new RunnableTest();
        Thread thread = new Thread(r,"实现接口线程");
        thread.start();

        // lambda简写
        Thread t = new Thread(() -> {
            System.out.println("start new thread!");
        });
        t.start(); // 启动新线程

        //
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("start2 new thread!");
            }
        };
        Thread t2 = new Thread(runnable);
        t2.start();

    }
}
