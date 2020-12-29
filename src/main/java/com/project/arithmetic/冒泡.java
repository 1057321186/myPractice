package com.project.arithmetic;

public class 冒泡 {
	
	public static void main(String[] args) {
		// 数据源
		int arr[]={7,2,1,10,6,3,8};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					arr[j]=arr[j+1]+arr[j];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
	}

}
