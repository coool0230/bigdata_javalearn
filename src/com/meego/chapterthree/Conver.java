/**
* Filename : Conver.java
* Author : huyn
* Creation time : ����6:27:13 - 2018��5��19��
* Description :
*/
package com.meego.chapterthree;
public class Conver {
	public static void main(String[] args){
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.46546;
		System.out.println("byte������float���ͽ�������Ľ��Ϊ:"+(mybyte+myfloat));
		System.out.println("byte������int���ͽ�������Ľ��Ϊ:"+(mybyte+myint));
		System.out.println("byte������char���ͽ�������Ľ��Ϊ:"+(mybyte+mychar));
		System.out.println("double������char���ͽ�������Ľ��Ϊ:"+(mydouble+mychar));
	}

}
