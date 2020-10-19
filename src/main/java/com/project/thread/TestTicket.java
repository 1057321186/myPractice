package com.project.thread;


/**  		 抢票测试
*		创建三个线程同时抢票
*/
public class TestTicket {
	public static void main(String[] args) {
		AirPort airPort=new AirPort();
		//创建三个线程同时抢票
		Thread t1=new Thread(new TicketThread(airPort),"王春");
		t1.start();
		Thread t2=new Thread(new TicketThread(airPort),"李博");
		t2.start();
		Thread t3=new Thread(new TicketThread(airPort),"张浩");
		t3.start();
	}
}

//航空类 
class AirPort{
	//票数
	private int number=30;
	private int getNumber(){
		return number;
	}
	
	//线程抢到票，票数减一
	//2、同步方法:整个方法加锁
	 public synchronized void reduce(){
		 //线程要同步，只有一个线程在处理余票，另外的线程必须等待，当前处理完了还得将余票数据共享出去
		
		 	--number;//减少票数
			System.out.println(Thread.currentThread().getName()+"抢到一张,"+"剩余票数"+number);

		 //1、同步代码块：只给局部加锁
		 /* synchronized (this) {
			 --number;
			System.out.println(Thread.currentThread().getName()+"抢到一张,"+"剩余票数"+number);
		}*/
	 }
}

//线程类
class TicketThread implements Runnable{
	private AirPort air;
	public  TicketThread(AirPort air) {
		this.air=air;
	}
	
	@Override
	public  void  run() {
		for(int i=0;i<10;i++){
			air.reduce();	//抢到一张，票少一张
			try {
				//抢到票，休眠一下
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}