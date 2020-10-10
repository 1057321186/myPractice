package com.project.thread.base;


/**
 *  1、继承Thread类
 *  2、重写run()
 *
 * 	线程体，多线程任务都在run里面执行
 *
 *
 * */

public class ThreadTest extends Thread{

        @Override
        public void run() {
            try {

                System.out.println(Thread.currentThread().getName()+" thread start "+"--"+System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" thread end "+"--"+System.currentTimeMillis());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
    }


}
