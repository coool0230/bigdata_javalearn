/**
* Filename : RightScope1.java
* Author : huyn
* Creation time : ����11:17:26 - 2018��12��27��
* Description :
*/
package com.meego.day7;


public class RightScope1 {
	public static void main(String[] args){
		RightScopA ss = new RightScopA();
		ss.sayHello();
	}
}


class RightScopA {
	static void sayHello(){
		System.out.println("hello world");
	}
}



