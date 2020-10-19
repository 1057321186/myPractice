package com.project.thread;

public class YieldDemo {
public static void main(String[] args) {
	Runnable runnable=new Runnable() {
		
		@Override
		public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+","+i);
					if(i==5){
						//暗示CPU愿意让出当前线程的CPU使用权，但是CPU可能忽略
						Thread.yield();
					}
				}
		}
	};
	
	new Thread(runnable,"A").start();
	new Thread(runnable,"B").start();
}
}
