package com.project.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOtest {
	public static void main(String[] args) {
		
		
		String path="C:\\Users\\Administrator\\Desktop\\文件写入.txt";		//文件地址
		File file  = new  File(path);		//创建文件对象
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			//创建文件字节输出流对象
			FileOutputStream out = new  FileOutputStream(file);	
			//创建字节数组
			byte [] content= "将字符串内容调用.getBytes()方法转成字节存入数组中".getBytes();
			out.write(content);		//write():	将指定的字节写入输出流
 		} catch (Exception e) {	
			e.printStackTrace();
		}	
			//创建FileInputStream类对象
		try {
			FileInputStream in = new FileInputStream(file);
			byte by[] = new byte[1000];		//创建一个指定大小的数组来接收输出流的内容
			int len=in.read(by);		//read():	从输入流中读取一定长度的字节，并以整数的形式返回字节数
			
			//输出文件中的信息
			System.out.println("文件中的信息是"+new String(by,0,len));
			in.close(); 	//关闭流！！！！		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

