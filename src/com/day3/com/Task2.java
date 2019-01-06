/**
* Filename : Task2.java
* Author : huyn
* Creation time : 下午3:55:23 - 2018年12月22日
* Description :对数组进行冒泡排序(实现正序/倒序),封装成方法,返回排序后的结果
*/
package com.day3.com;
public class Task2 {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,44,5,66,77,88};
		int []  res= bubbleSort(arr1);
		for(int i = 0;i < res.length;i ++){
			System.out.print(res[i] + "  ");
		}
		
	}
	
	
	public static int[] bubbleSort(int[] arr){
		for(int i = 0;i <arr.length;i ++){
			for(int j  = i + 1;j < arr.length;j ++ ){
				if(arr[i] < arr[j]){
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
//	public static int[] sortSelf(int[] arr){
//		int[] arr1 = new int[arr.length];
//		for(int i = 0;i < arr.length;i ++){
//			失败,每次提取最大的,但是第二大的找不到
//		}
//	}
}
