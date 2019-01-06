/**
* Filename : ArrayDemo.java
* Author : huyn
* Creation time : 下午9:57:06 - 2018年12月20日
* Description :
*/
package com.day3.com;
public class ArrayDemo {
	public static void main (String[] args){
		int[] arr = new int[10];
		System.out.println(arr.length);
		arr[0] = 1;
		System.out.println(arr[0]);
		
		
		//定义数组,并直接初始化
		int[]  arr2 = new int[]{1,2,3};
		System.out.println(arr2[1]);   //越界时编译通得过,运行报错ArrayIndexOutOfBoundsException,数组索引超出边界
		
		//没有赋处置
		int [] arr3 = null;
		System.out.println(arr3 == null ? "null" :arr3.length);
		
		//直接赋初值
		int[] arr4 = {1,2,3};
		System.out.println(arr4.length);
	}
}
