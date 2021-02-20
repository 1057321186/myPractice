package com.project.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateXML {
public static void main(String[] args) {
	//1、创建目标文件对象
	File createxml=new File("我的.xml");
	//2、创建Document对象
	Document document=DocumentHelper.createDocument();
	//创建根节点
	Element root=document.addElement("school");
	//在根节点上添加属性name，值为四川师范大学
	root.addAttribute("name", "西南石油大学");
	root.addAttribute("value","双一流");
	//在school节点下创建class节点
	Element nextroot=root.addElement("class");
	nextroot.addAttribute("name", "计科院");
	nextroot.addAttribute("value", "软件工程");
	
	//创建输出格式对象，定义编码
	OutputFormat outputFormat=OutputFormat.createPrettyPrint();
	outputFormat.setEncoding("UTF-8");
	
	//创建XMLWriter对象,写出Document
	XMLWriter writer=null;
	try {
		writer=new XMLWriter(new FileWriter(createxml),outputFormat);
		writer.write(document);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
}
