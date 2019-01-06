/**
* Filename : ArrayDemo2.java
* Author : huyn
* Creation time : 下午10:42:29 - 2018年12月20日
* Description :
*/
package com.day3.com;
public class ArrayDemo2 {
	public static void main(String[] args){
		int arr[] = new int[50];
		for(int i=0; i < 50;i++){
			arr[i] =(int)i+1;
//			System.out.println(arr);
		}
		for(int i = 0;i< 50;i++){
			System.out.println("arr[" + i + "] =" + arr[i]);
		}
	}

}
