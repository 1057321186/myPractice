package com.project.thread;

public class Test3 {
	public static void main(String[] args) {
		Thread thread1=new Thread(new T3(),"线程1");
		thread1.start();
		
		Thread thread2=new Thread(new T3(),"线程2");
		thread2.start();
		for(int i=0;i<10;i++){
			System.out.println("我是主线程");
		}
	}
}

class T3 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+" i:"+i);
			if(i%2==0){
				//当为偶数时，暂停线程
				System.out.println("---暂停---");
				Thread.yield();
			}
		}
	}
	
}