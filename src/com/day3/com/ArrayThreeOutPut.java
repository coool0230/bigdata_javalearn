/**
* Filename : ArrayThreeOutPut.java
* Author : huyn
* Creation time : 下午7:15:02 - 2018年12月22日
* Description :三围数组的横向输出
*/
package com.day3.com;
public class ArrayThreeOutPut {
	public static void main(String[] args){
		int[][][] arr = {
				{
					{1,2,3},{4,5,6},{7,8,9}
				},
				{
					{10,11,12},{13,14,15},{16,17,18}
				},{
					{19,20,21},{22,23,24},{25,26,27}
				}
		};
		for(int i = 0;i < arr.length;i ++){
//			System.out.println();
			for(int j = 0;j < arr[i].length;j ++){
//				System.out.println();
				for(int k = 0;k < arr[i][j].length;k ++){
					System.out.print(arr[j][i][k]+ "         ");
					
				}
				
			}
			System.out.println();
		}
	}
}

//  依次输出     a000 a001 a002 a100 a101 a102 a200 a201 a202
//  依次输出     a010 a011  a012  a110  a101 a112  a210 a211  a212
//  依次输出     a020 a021 a022 a120 a121 a122 a220 a221 a222
