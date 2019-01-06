/**
* Filename : Circulate.java
* Author : huyn
* Creation time : 下午3:54:37 - 2018年5月20日
* Description :
*/
package com.chapterfour.com;
public class Circulate {
	public static void main(String[] args){
		int sum =0;
		for (int i =2;i<=100;i+=2){
			sum = sum + i;
		}
		System.out.println("2到100之间的所有偶数的之和为:"+sum);
	}

}
