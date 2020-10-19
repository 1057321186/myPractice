package com.project.designmode.single;

//单例的双重检测实现
public class Singleton {
	private static Singleton singleton;
	private  Singleton() {

	}
	public static Singleton getInstance(){
		//第一次检测
		if(singleton==null)		
		{
			//同步
			synchronized (Singleton.class) {
				if(singleton==null){
					//多线程环境下可能会出现问题的地方
					singleton=new Singleton();
				}
			}
		}
		return singleton;
		
	}
}
