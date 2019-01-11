/**
* Filename : Bubble1.java
* Author : huyn
* Creation time : ����10:53:58 - 2018��12��21��
* Description :ð������
*/
package com.meego.day3;
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
		//��ǿforѭ��
		for(int ii : arr){
			System.out.print(ii + " ");
		}
	}

}
