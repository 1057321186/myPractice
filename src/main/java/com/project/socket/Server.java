package com.project.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		
		try {
			//服务端打开端口8080
			ServerSocket serverSocket=new ServerSocket(8888);
			
			//在端口8080监听，看看是否有连接请求过来
			System.out.println("监听端口号：8888");
			
			Socket socket=serverSocket.accept();
			System.out.println("有连接过来:"+socket);
			 //打开输入流
            InputStream is = socket.getInputStream();
 
            //读取客户端发送的数据
            int msg = is.read();
            //打印出来
            System.out.println(msg);
            is.close();
			serverSocket.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
