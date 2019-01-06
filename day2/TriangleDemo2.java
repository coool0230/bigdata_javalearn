/**
* Filename : TriangleDemo2.java
* Author : huyn
* Creation time : 下午10:13:57 - 2018年12月19日
* Description :打印空心三角形
*/
package com.day2.com;
public class TriangleDemo2 {
	public static void main(String[] args){
		int lie = 11;
		int hang = 1;
		char s = ' ';
		char ss = '*';
		while(hang <=6){
			int a = 1;
			while(a<lie){
				int s0 = hang +(hang-1);
				int s1 = 11 -s0;
				int s2 = (s1/2);
				if(a <= s2 || a > (s2 +s0)){
					System.out.print(s);
			}
				else{
					System.out.print(ss);
				}
//			System.out.println();
			a ++;
		}
			System.out.println();
			hang ++;
	}
	}
}
