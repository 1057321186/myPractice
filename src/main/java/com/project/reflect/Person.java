package com.project.reflect;

import lombok.Data;

@Data
public class Person {
	public int age;
	private String name;
	{
		System.out.println("类被初始化");
	}
	public Person() {

	}
	
	Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	void say(){
		System.out.println(this.name+"说：你是猪儿虫");
	}
	


}
