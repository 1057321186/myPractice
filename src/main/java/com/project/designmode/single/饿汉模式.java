package com.project.designmode.single;

//线程安全版
public class 饿汉模式 {
	
	private  饿汉模式(){}
	private static 饿汉模式 instance=new 饿汉模式();
	public static synchronized 饿汉模式 getInstance(){

		return instance;
	}
}
