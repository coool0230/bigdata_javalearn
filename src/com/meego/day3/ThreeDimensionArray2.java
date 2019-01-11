/**
* Filename : TwoDimensionArray.java
* Author : huyn
* Creation time : ����3:15:18 - 2018��12��22��
* Description :
*/
package com.meego.day3;
public class ThreeDimensionArray2 {
	public static void main(String[] args){
		int[][] arr = new int[3][3];
		int[][] arr1 = {{1,2,3},{22,33,44},{56,67,78}};
		int[][][] arr3 = {
					{
						{1,2,3},{4,5,6}
					},
					{{5,6},{8,9}
					},
					{{33,22},{0,11}
					}
				};
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
		outThreeArr(arr3);
	}
	public static void outPut(int[][] arr){
		for(int i = 0;i < arr.length;i ++){
			for(int j =0;j < arr[i].length;j ++){
				System.out.print(arr[i][j]  + " ");
			}
			System.out.println();
		}
	}
	public static void outThreeArr(int[][][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j ++){
				for(int k = 0;k < arr[i][j].length;k++){
					System.out.print(arr[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
