/**
* Filename : ArrayDemo2.java
* Author : huyn
* Creation time : ����10:42:29 - 2018��12��20��
* Description :
*/
package com.meego.day3;
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
