package com.project.thread;



public class SleepAndWait {
	public static void main(String[] args) {
		final Object lock = new Object();
		
		//执行线程1
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread A is waiting to get lock");
				synchronized (lock) {
				try {
					System.out.println("Thread A get lock");
					Thread.sleep(20);
					System.out.println("Thread A go wait");
					lock.wait(10);//会释放锁,加了指定等待时间，醒之后需要去抢到临界区的锁，才能真正把代码执行下去，光有唤醒是不够的
					System.out.println("Thread A is done");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		}).start();
		
		//执行线程2
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread B is waiting to get lock");
				synchronized (lock) {
				try {
					System.out.println("Thread B get lock");
					Thread.sleep(20);
					System.out.println("Thread B go wait");
					lock.wait();//会释放锁
					System.out.println("Thread B is done");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		}).start();
	
	}
}
