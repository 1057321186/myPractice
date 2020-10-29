package com.project.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) {
	try {
		Socket socket = new Socket("127.0.0.1",8888);
		System.out.println(socket);
		 // 打开输出流
        OutputStream os = socket.getOutputStream();

        // 发送数字110到服务端
        os.write(120);
        os.close();
		socket.close();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
