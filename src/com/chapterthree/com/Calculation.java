/**
* Filename : Calculation.java
* Author : huyn
* Creation time : 下午6:11:45 - 2018年5月19日
* Description :
*/
package com.chapterthree.com;
public class Calculation {
	public static void main(String[] args){
		int a,b;
		a = 2;
		b = 5;
		boolean result = ((a>b)&&(a!=b));
		boolean result1 = ((a>b)||(a!=b));
		System.out.println(result);
		System.out.println(result1);
	}

}
