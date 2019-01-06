/**
* Filename : ArrayZhuanZHi.java
* Author : huyn
* Creation time : 下午6:45:35 - 2018年12月22日
* Description :二维数组的转置矩阵
*/
package com.day3.com;
public class ArrayZhuanZHi {
	public static void main(String[] args){
		int[][]  arr1 =  {
				{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}
				};
		int[][]  arr2 = new int[5][4];
		for(int i = 0;i < arr2.length;i++){
			for(int j = 0;j< arr2[i].length;j ++){
//				int temp = arr1[i][j];
				arr2[i][j] = arr1[j][i];
//				arr2[j][i] = temp;
			}
		}
		outPut(arr2);

		}
	public static void outPut(int[][] arr){
		for(int i= 0;i < arr.length;i ++){
			for(int j = 0;j < arr[i].length;j ++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
		
}
