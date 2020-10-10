package com.project.dead;

/**
 * 死锁
 */
public class DeadLockDemo {
    final static Object A = new Object();
    final static Object B = new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (A) {
                    System.out.println(Thread.currentThread().getName()+"锁了A");
                    try {
                        Thread.sleep(100);//给线程2时间获取锁
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (true) {
                        System.out.println("等待获取锁B");
                        synchronized (B) {
                            System.out.println("锁B");
                        }
                    }
                }
            }
        },"线程1").start();

        // lambda简写
        new Thread(() -> {
                synchronized (B) {
                    System.out.println(Thread.currentThread().getName()+"锁了B");
                    if (true) {
                        System.out.println("等待获取锁A");
                        synchronized (A) {
                            System.out.println("锁A");
                        }
                    }
                }

        },"线程2").start();
    }
}
