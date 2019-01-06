/**
* Filename : ArrayOfCopy.java
* Author : huyn
* Creation time : 下午4:23:49 - 2018年12月22日
* Description :实现数组的拷贝,将一个数组的元素复制到另一个数组中,如果元素个数不等,或者截取或者回绕
*/
package com.day3.com;
public class ArrayOfCopy {
	public static void main(String[] args){
		int[] a = {4,5,6,7};
		int[] b = {1,2,3,4};
		int[] c = {8,9};
		int[] d = {10,11,12};
		int[] e = {14,13,15};
		int[] f = {15,16,17,18,19,12,11,10,19,18,17};
		int[] a2b = arrayOfCopy(a,b);   //a=b情况下
		int[] d2c = arrayOfCopy(d,c);   //a>b情况下
		int[] c2b = arrayOfCopy(e,f);   //a<b相等情况下
		outArray(a);
		outArray(a2b);
		outArray(d2c);
		outArray(c2b);
	}
	public static int[] arrayOfCopy(int[] arr1,int[] arr2){
		if(arr1.length < arr2.length){
			int t = (arr2.length/arr1.length+1);
//			System.out.print(t);
			for(int i = 0;i < t;i++){
				for(int j =0;j < arr1.length;j ++){
					if(j+(arr1.length*i) <= arr2.length-1){
						//直接取余  就可以    
						arr2[j+(arr1.length*i)] = arr1[j];
					}
					else{
						break;
					}
					
				}
			}
		}
		else if(arr1.length == arr2.length){
			for(int i = 0;i < arr2.length-1;i++){
				arr2[i] = arr1[i];
			}
		}
		else{
			for(int i = 0;i < arr2.length;i++)
				arr2[i] = arr1[i];
		}
		return arr2;
	}
	public static void outArray(int[] arr){
//		for(int i : arr){
//			System.out.print(arr[i]);
		
		
		//增强for循环
		for(int i : arr){
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
