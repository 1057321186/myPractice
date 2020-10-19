package com.project.thread.处理线程返回值;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Method3 implements Callable<String> {

	public static void main(String[] args) {
		Method3 method3 = new Method3();
		FutureTask<String> futureTask = new FutureTask<>(method3);
		new Thread(futureTask).start();
		//isDone()：判断Futuretask的call（）是否执行完
		if(!futureTask.isDone()){
			System.out.println("task has not finished,please wait");
		}
		try {
			System.out.println("task return:"+futureTask.get());//通过FutureTask的get()方法获取返回值
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	//重写call()
	@Override
	public String call() throws Exception {
		String value = null;
		try {
			System.out.println("task ready to work");
			value="我又又有值了";
			Thread.sleep(2000);
			System.out.println("task done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return value;
	}

}
