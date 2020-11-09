package com.project.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadAndWrite {
	public static void main(String[] args) {

		/***创建一个指定位置的txt文件，并且写入内容***/

		String pathname = "C:\\Users\\Administrator\\Desktop\\文件写入.txt";
		File file = new File(pathname);                //创建一个文件对象
		try {
			if (!file.exists()) {            //如果文件不存在，则创建一个文件
				file.createNewFile();
			}
			FileOutputStream out = new FileOutputStream(file);    //给被指定文件file创建一个文件输出流
			//创建字节数组
			byte[] content = "将要存入的字符串调用getBytes()方法转成字节".getBytes();

			out.write(content);        //将content写入file的输出流
			out.close();            //关闭流
			System.out.println("文件已经创建，并且内容已经录入:" + new String(content));
		} catch (IOException e) {

			e.printStackTrace();
		}

		/***读取指定文件的内容，并且输出到控制台***/
		try {
			FileInputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\文件写入.txt");

			byte[] con = new byte[1024];
			int lenth = inputStream.read(con);
			System.out.println("文件中的信息是\r\n" + new String(con, 0, lenth));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

