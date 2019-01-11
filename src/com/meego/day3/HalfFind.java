/**
* Filename : HalfFind.java
* Author : huyn
* Creation time : ����12:06:42 - 2018��12��22��
* Description :
*/
package com.meego.day3;
public class HalfFind {
	public static void main(String[] args){
		int[] arr = {3,5,8,9,12,34,56,66,78};
		int min = 0;
		int max = arr.length -1;
		
		int num = 10;
		int index = -1;
		
		while(min <= max){
			int mid  = (min + max ) / 2;
			//�ҵ���
			if(arr[mid] ==num){
				index = mid;
				
				break;
			}
			//��Χ��������
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
