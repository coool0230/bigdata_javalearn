/**
* Filename : HalfFindSelf.java
* Author : huyn
* Creation time : ����6:10:29 - 2018��12��22��
* Description :
*/
package com.meego.day3;
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
			int mid = (min + max) /2; //mid���붨����ѭ���ڲ�,�����жϲ�����ʱ,�������¶���mid
			if(arr[mid] == a){
				//�ҵ���
				index = mid;
				break;
			}
			else if(arr[mid] > a){
				//�������
				max = mid -1;
			}
			else{
				min = mid + 1;
			}
		}
		return index;
	}	
}
