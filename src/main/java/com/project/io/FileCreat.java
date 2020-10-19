package com.project.io;

import java.io.File;
import java.io.IOException;

public class FileCreat {
	public static void main(String[] args) throws IOException {
		// 绝对路径
	    File f1 = new File("C:\\Users\\Administrator\\Desktop\\a");
	    if(!f1.exists()){			//如果文件不存在，则创建一个文件
			f1.createNewFile();}
	    System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
	    // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
//	    File f2 = new File("LOL.exe");
//	    System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

	    // 把f1作为父目录创建文件对象
	    File f3 = new File(f1, "LOL.exe");

	    System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
	}
}