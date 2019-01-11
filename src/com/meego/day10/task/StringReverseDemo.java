package com.meego.day10.task;

public class StringReverseDemo {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		for(int i = str.length()-1;i >= 0; i--) {
			System.out.print(str.substring(i,i+1));
		}

	}

}

//把字符串倒序输出

