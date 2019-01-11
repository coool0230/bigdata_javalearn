/**
* Filename : TwoDimensionArray.java
* Author : huyn
* Creation time : ����3:15:18 - 2018��12��22��
* Description :
*/
package com.meego.day3;
public class TwoDimensionArray {
	public static void main(String[] args){
		int[][] arr = new int[3][3];
		int[][] arr1 = {{1,2,3},{22,33,44},{56,67,78}};
		int num = 1;
		for(int i = 0;i < arr.length;i ++){
			for(int j  = 0;j < 3;j ++){
				arr[i][j] = num;
				num ++;
			}
		}
		//��ӡ
		outPut(arr);
		outPut(arr1);
	}
	public static void outPut(int[][] arr){
		for(int i = 0;i < arr.length;i ++){
			for(int j =0;j < arr[i].length;j ++){
				System.out.print(arr[i][j]  + " ");
			}
			System.out.println();
		}
	}
}
