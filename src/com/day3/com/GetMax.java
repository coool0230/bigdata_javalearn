/**
* Filename : GetMax.java
* Author : huyn
* Creation time : 下午11:08:10 - 2018年12月20日
* Description :
*/
package com.day3.com;
public class GetMax {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,1113,11223};
//		int[] arr2 = {-1,-2,-3,-6,-8};
		int max1 = getMax(arr1);
		System.out.println(max1);
		getMaxx(arr1);
	}
	public static int getMax(int[] arr){
		int res = arr[0];
		for(int i = 1;i< arr.length;i++){
			res = max(res,arr[i]);
		}
		return res;
	}
	public static  int max(int a,int b){
		int max = a > b?a:b;
		return max;
	}
	
	public static int getMaxx(int[] arr){
		if(arr == null || arr.length == 0){
			return -1;
		}
//		int max = 0;     //如果数组全是负数,则返回0,明显不对
		int max = arr[0];    //避免出现数组全是负数的情况
		for(int i = 0;i < arr.length;i++){                             //数组只有一个元素,也成立
			max = max > arr[i] ? max : arr[i];
		}
		System.out.println(max);
		return max;
	}
}
