/**
* Filename : SecectSort.java
* Author : huyn
* Creation time : 下午11:17:04 - 2018年12月21日
* Description :选择排序法
*/
package com.day3.com;
public class SecectSort {
	public static void main(String[] args){
		int[]  arr = {3,2,4,5,6,7,8,1};
		for(int i = 0;i < arr.length-1;i ++){
			for(int j = i+ 1;j < arr.length; j ++){
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//增强for循环
		for(int i : arr){
			System.out.print(i + "  ");
		}
	}

}
