/**
* Filename : HalfFind.java
* Author : huyn
* Creation time : 上午12:06:42 - 2018年12月22日
* Description :
*/
package com.day3.com;
public class HalfFind {
	public static void main(String[] args){
		int[] arr = {3,5,8,9,12,34,56,66,78};
		int min = 0;
		int max = arr.length -1;
		
		int num = 10;
		int index = -1;
		
		while(min <= max){
			int mid  = (min + max ) / 2;
			//找到了
			if(arr[mid] ==num){
				index = mid;
				
				break;
			}
			//范围落在左半边
			else if(arr[mid] > num){
				max = mid -1;
				
			}
			else{
				min = mid + 1;
			}
		}
		System.out.println(index);
	}
}
