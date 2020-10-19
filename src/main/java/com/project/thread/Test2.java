package com.project.thread;

import java.util.Date;

public class Test2 {
	
//main方法一般是主线程
public static void main(String[] args) {
	
	for(int i=0;i<100;i++){
		System.out.println(i);
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
	}
	Th th=new Th();
	Thread thread=new Thread(th);
	thread.start();
	//主线程休眠后，结束子线程
	//	thread.boo=false;//设置子线程循环为flase
	//	th.boo=false;
	System.out.println("执行main线程");
		
	//(2) 调用interrupt表示将当前运行的线程打断，
	
}
}

class Th implements Runnable{
	boolean boo=true;
	public void run() {
		while(boo){
			System.out.println("时间"+new Date());	
		}		
	}
}

