/**
* Filename : TriangleDemo.java
* Author : huyn
* Creation time : 下午8:38:54 - 2018年12月19日
* Description :打印直角三角形
*/
package com.day2.com;
public class TriangleDemo {
	public static void main(String[] args){
//		int n = 10;
		int i = 1;
		while( i <= 10){
			int j = 1;
			while(j <= i){
				System.out.print("*");
				j ++;
			}
			System.out.println();
			i ++;
		}
		}


}
