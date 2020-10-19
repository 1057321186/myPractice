package com.project.thread.处理线程返回值;

//如何给run（）方法传参？
//1、构造函数传参
//2、成员变量传参
//3、回调函数传参

//如何处理线程的返回值
public class Method1 implements Runnable {
	private String value;

	public static void main(String[] args) {

		Method1 method1 = new Method1();
		Thread thread = new Thread(method1);
		thread.start();
		// System.out.println(method1.value);//不能够精准获取返回值
		// 采用主线程等待法
		while (method1.value == null) {
			try {
				Thread.sleep(1000);//继续等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(method1.value);
	}

	@Override
	public void run() {
		try {
			Thread.currentThread();
			// 让线程等待1秒才赋值
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		value = "we have value";
	}

}
