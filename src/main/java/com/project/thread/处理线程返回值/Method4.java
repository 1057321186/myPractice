package com.project.thread.处理线程返回值;

import java.util.concurrent.*;

//使用线程池
public class Method4 implements Callable {
	
	public static void main(String[] args) {
		//创建线程池对象
		ExecutorService newCachedThreadPool=Executors.newCachedThreadPool();
		//将Callable子线程对象传递给线程池，使用Future来接收
		Future<String> future=newCachedThreadPool.submit(new Method4());
		if(!future.isDone()){
			System.out.println("任务 has not finished,please 等待");
		}
		try {
			System.out.println("task return:" + future.get());//通过Future的get()方法获取返回值
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}


	public static String print(){
		return "嘻嘻嘻";
	}

	@Override
	public String call() throws Exception {
		return "嘻-嘻";
	}



}
