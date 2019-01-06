/**
* Filename : RightScope1.java
* Author : huyn
* Creation time : 下午11:17:26 - 2018年12月27日
* Description :
*/
package com.day7.com;


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



