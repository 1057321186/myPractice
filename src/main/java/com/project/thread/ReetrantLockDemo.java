package com.project.thread;

import java.util.concurrent.locks.ReentrantLock;



/*
 * 1、来自java.util.concurrent类
 * 2、使用lock()方法加锁，必须释放锁，一般在finally中释放
 * 3、能够实现细粒度控制
 * 4、和CountDownLatch、FutureTask、Semaphore一样基于AQS实现
 * 5、性能未必比Synchronized好，也是可重入锁
 *
 */

public class ReetrantLockDemo implements Runnable {

    //公平锁：参数设置为true,倾向于将锁赋予等待时间最久的线程
    //公平锁：每个线程获取到锁的概率是是公平的
    //设置false，不公平
    private ReentrantLock reentrantLock = new ReentrantLock(false);

    @Override
    public void run() {
        while(true){
            //加锁
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName()+"获取到锁");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                //释放锁
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        //两个线程去循环争抢锁
        new Thread(new ReetrantLockDemo(),"线程1").start();
        new Thread(new ReetrantLockDemo(),"线程2").start();
    }
}