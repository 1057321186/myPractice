package com.project.arithmetic;

public class 求6的阶乘 {
	public static void main(String[] args) {
		System.out.println(foo(6));
	}
	public static long foo(int a){
		if(a>1){
			return a*foo(a-1);
		}else {
			return 1;
		}
	}
}
