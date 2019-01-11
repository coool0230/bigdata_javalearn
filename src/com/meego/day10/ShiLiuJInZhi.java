package com.meego.day10;

class ShiLiuJinZhi{
	public static void main(String[] args){
		shiLiuBinary(13);
	}

	public static void shiLiuBinary(int num) {
		char[] arr = {0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f'};
		int[] crr = new int[32];
		int[] brr = {8,4,2,1};
		int col = 0;
		// String str;
		for (int i = 31; i >= 0; i--) {
			crr[31-i] = (num >> i & 1);
			// System.out.print(num >> i & 1);
		}
		// for(int n = 0; n < crr.length;n ++){
		// 	System.out.print(crr[n] + " ");
		// }
		for(int j = 0;j < 8;j ++){
			for(int k = 0;k < 4; k ++){
				col = col + crr[4 * j + k]  *  brr[k];
				// System.out.println(col);
			}
			
			System.out.print(arr[col]);
			System.out.print(arr[0]);
			col = 0;
		}

	}
}

// 00000000000000000000000000001101
// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 0 1
//        d