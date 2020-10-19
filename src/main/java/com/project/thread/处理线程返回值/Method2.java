package com.project.thread.处理线程返回值;



//使用Thread类的join()方法阻塞当前线程以等待子线程处理完毕
public class Method2 implements Runnable{

	private String value;
	public static void main(String[] args) {
		Method2 method2=new Method2();
		Thread thread=new Thread(method2);
		thread.start();
		while(method2.value==null){
			try {
				System.out.println(System.currentTimeMillis());
				thread.join(100);//等待该线程终止的时间最长为 millis 毫秒。
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("value:"+method2.value);
		
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		value="我又有值了";
	}

}
