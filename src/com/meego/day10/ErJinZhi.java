package com.meego.day10;

class ErJinZhi{
	public static void main(String[] args){
		Binary(13);
	}

	public static void Binary(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(num >> i & 1);
		}
	}
}