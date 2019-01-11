/**
* Filename : ExceptionDemo2.java
* Author : huyn
* Creation time : ����8:29:38 - 2018��12��27��
* Description :
*/
package com.meego.day7;
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
			System.out.println("����������");
			System.out.println(e.getMessage());
		}
	}
}
