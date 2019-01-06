/**
* Filename : Conver.java
* Author : huyn
* Creation time : 下午6:27:13 - 2018年5月19日
* Description :
*/
package com.chapterthree.com;
public class Conver {
	public static void main(String[] args){
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte类型与float类型进行运算的结果为:"+(mybyte+myfloat));
		System.out.println("byte类型与int类型进行运算的结果为:"+(mybyte+myint));
		System.out.println("byte类型与char类型进行运算的结果为:"+(mybyte+mychar));
		System.out.println("double类型与char类型进行运算的结果为:"+(mydouble+mychar));
	}

}
