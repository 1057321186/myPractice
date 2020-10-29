package com.project.io;

import java.io.File;
import java.io.IOException;

/**
 * 注意Windows平台使用\作为路径分隔符，
 * 在Java字符串中需要用\\表示一个\。
 * Linux平台使用/作为路径分隔符：File f = new File("/usr/bin/javac");
 *
 *
 * File对象既可以表示文件，也可以表示目录
 */

public class Test {
    public static void main(String[] args) {

        String path = "C:\\Users\\Administrator\\Desktop\\File.txt";
        File file = createFile(path);


    }

    static File createFile(String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件已经创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println("是否为文件夹:"+file.isDirectory());
        return file;
    }



}
