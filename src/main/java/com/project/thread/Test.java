package com.project.thread;

//Java是单继承，无法继承多个类
//所以实际开发中常用通过Runnable接口实现多线程

public class Test {
	public static void main(String[] args) {
		// 方法一
		Thread1 thread1 = new Thread1();
		// Thread t1=new Thread(thread1);
		Thread t1 = new Thread(thread1, "线程1");// 创建线程并命名
		t1.start();
		// 方法二
		Thread t2 = new Thread(new Thread2(), "线程2");
		t2.start();
		System.out.println("执行主线程");
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		threadLocal.set("这是值");
		String s = threadLocal.get();
		System.out.println(s);
	}
}

// 线程类1
class Thread1 implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("当前线程1:" + Thread.currentThread().getName() + "  " + i);
			// 休眠当前线程0.1s
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

// 线程类2
class Thread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("当前线程2:" + Thread.currentThread().getName() + "  " + i);
		}
	}
}
