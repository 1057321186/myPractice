package com.project.designmode.single;


//饱汉模式 (懒汉)
public class 饱汉模式 {

	private 饱汉模式(){};
	
	private static 饱汉模式 instance;
	//加synchronized线程安全
	public  synchronized static 饱汉模式 getInstance(){
		if (instance == null) {
			instance = new 饱汉模式();
		}
		return instance;
	}

	
}




