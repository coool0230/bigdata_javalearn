/**
* Filename : HalfFindSelf.java
* Author : huyn
* Creation time : 下午6:10:29 - 2018年12月22日
* Description :
*/
package com.day3.com;
public class HalfFindSelf {
	public static void main(String[] args){
		int[] arr = {1,2,23,34,56,77,88,99,101};
		int num = 7;
		int res = halfFindSelf(num,arr);
		System.out.println(res);
	}
	public static void outArr(int[] arr){
		for(int i : arr){
			System.out.print(i);
		}
	}
	public static int halfFindSelf(int a,int[] arr){
		int index = -1;
		int min = 0;
		int max = arr.length-1;
//		int mid = (min + max) /2; 
		while(min <= max){
			int mid = (min + max) /2; //mid必须定义在循环内部,否则判断不成立时,都会重新定义mid
			if(arr[mid] == a){
				//找到了
				index = mid;
				break;
			}
			else if(arr[mid] > a){
				//落在左边
				max = mid -1;
			}
			else{
				min = mid + 1;
			}
		}
		return index;
	}	
}
