/**
* Filename : Calculation.java
* Author : huyn
* Creation time : ����6:11:45 - 2018��5��19��
* Description :
*/
package com.meego.chapterthree;
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
