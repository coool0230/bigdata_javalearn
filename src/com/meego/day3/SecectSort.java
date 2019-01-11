/**
* Filename : SecectSort.java
* Author : huyn
* Creation time : ����11:17:04 - 2018��12��21��
* Description :ѡ������
*/
package com.meego.day3;
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
		//��ǿforѭ��
		for(int i : arr){
			System.out.print(i + "  ");
		}
	}

}
