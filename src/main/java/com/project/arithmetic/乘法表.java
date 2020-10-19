package com.project.arithmetic;

/**
 *
 *  打印输出 99乘法表
 *
 */
public class 乘法表 {
	public static void main(String[] args) {
//		for(int i=1,j=1;j<=9;i++){
//			System.out.print(i+"*"+j+"="+i*j+"\t");
//			if(i==j){
//				i=0;
//				j++;
//				System.out.println("");
//				
//			}
//		}
//		
//		for(int a=1;a<=9;a++){
//			for(int b=1;b<=a;b++){
//				System.out.print(a+"*"+b+"="+a*b+"\t");
//			}
//			System.out.println();
//		}

	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}
		System.out.println();
	}
	
	}
	
}
