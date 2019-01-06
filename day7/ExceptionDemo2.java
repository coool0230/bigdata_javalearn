/**
* Filename : ExceptionDemo2.java
* Author : huyn
* Creation time : 下午8:29:38 - 2018年12月27日
* Description :
*/
package com.day7.com;
public class ExceptionDemo2 {
	public static void main(String[] args){
		int[] arr = null;
		outArr(arr);
	}
	public static void outArr(int[] arr){
		try{
			for(int i = 0;i < arr.length;i++){
				System.out.print(arr[i]);
			}
		}
		catch(Exception e){
			System.out.println("数组有问题");
			System.out.println(e.getMessage());
		}
	}
}
