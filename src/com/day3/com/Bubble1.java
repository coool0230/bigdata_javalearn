/**
* Filename : Bubble1.java
* Author : huyn
* Creation time : 下午10:53:58 - 2018年12月21日
* Description :冒泡排序
*/
package com.day3.com;
public class Bubble1 {
	public static void main(String[] args){
		int[] arr = {3,1,4,2,6,5};
		for (int i = arr.length -1;i > 0; i --){
			for (int j = 0;j < i;j ++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}

			}
		//增强for循环
		for(int ii : arr){
			System.out.print(ii + " ");
		}
	}

}
