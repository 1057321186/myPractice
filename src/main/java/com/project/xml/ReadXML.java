package com.project.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class ReadXML {
	public static void main(String[] args) {
			SAXReader saxReader=new SAXReader();
			try {
				Document document=saxReader.read(new File("create.xml"));
				//获取xml根节点元素
				Element root=document.getRootElement();
				//获取根节点名称
				String shoolname=root.getName();
				System.out.println(shoolname);
				//获取根节点元素的属性
				Attribute schoolnameAttrName=root.attribute("name");
				//获取属性的值
				String schoolnameAttrNameVal=schoolnameAttrName.getValue();
				//获取根元素的子标签
				List<Element> classes=root.elements();
				for(Element e:classes){
					//循环操作每一个子元素
					//class元素名称
					String className= e.getName();
					//获取class元素name属性值
					String classAttrName=e.attribute("name").getValue();
					
					//System.out.println(className+":"+classAttrName);
					
					List<Element> students=e.elements();
					for(Element e1 : students){
						//student标签名称
						String studentName=e1.getName();
						//student下子标签
						List<Element> eles=e1.elements();
						for(Element e2 : eles){
							String name =e2.getName();
							String text =e2.getText();
							System.out.println(name+":"+text);
						}
					}				
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
}
