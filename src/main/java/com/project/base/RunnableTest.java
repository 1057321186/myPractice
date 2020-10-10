package com.project.base;


/**
 *  实现Runnable接口的线程类需要 new一个Thread类来启动线程
 *
 *  1、实现Runnable接口
 *  2、重写run()
 *  3、新建类实例和Thread实例，将类实例传入给Thread(类实例)
 *  4、通过Thread实例调用start()启动线程
 *
 */

public class RunnableTest implements Runnable{
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
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest,"实现接口的线程");
        thread.start();
    }
}
