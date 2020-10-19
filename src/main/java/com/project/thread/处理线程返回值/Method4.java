package com.project.thread.处理线程返回值;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//使用线程池
public class Method4 {
	
	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService newCachedThreadPool=Executors.newCachedThreadPool();
		//将Callable子线程对象传递给线程池，使用Future来接收
		Future<String> future=newCachedThreadPool.submit(new Method3());
		if(!future.isDone()){
			System.out.println("task has not finished,please wait");
		}
		try {
			System.out.println("task return:"+future.get());//通过Future的get()方法获取返回值
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
