package com.project.reflect;

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
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
