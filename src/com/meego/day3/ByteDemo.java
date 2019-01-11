/**
* Filename : ByteDemo.java
* Author : huyn
* Creation time : ����7:38:19 - 2018��12��22��
* Description :��ҵһ  
*/
package com.meego.day3;
public class ByteDemo {
	public static void main(String[] args){
		int b = 100;
		int i  = b & 0xff;   //��255��������
		System.out.println(i);
		outIntBinaryString(-1);
		outIntBinaryString(0);
		outIntBinaryString(255);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		out2DArr(arr);
		rotate2DArr(arr);
		out2DArr(arr);
	}
	public static int byteScope(byte b){
		return b & 0xff;
	}
	//00000000 00000000 00000000 00000101
	public static void outIntBinaryString(int n){
		for(int i = 31;i >=0;i--){
			System.out.print((n >> i) & 0x1);
		}
		System.out.println();
	}
	public static void rotate2DArr(int[][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < i;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	public static void out2DArr(int[][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
			}
	}
}
