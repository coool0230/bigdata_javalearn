/**
* Filename : PolyDemo2.java
* Author : huyn
* Creation time : 下午7:35:43 - 2018年12月26日
* Description :
*/
package com.day6.com;
public class PolyDemo2 {
	public static void main(String[] args){
		Jing82 jing82 = new Jing82();
//		jing82.name = "大黄";
		jing82.cry();
		System.out.println(jing82.name);
		
		Dog2 d1 = jing82;
		d1.cry();
		System.out.println(d1.name);
	}
}


abstract class Animal2{
	abstract void cry();
}

class Dog2 extends Animal2{
	public String name = "小白";
	public void cry(){
		System.out.println("wangwangwang...");
	}
}

class Jing82 extends Dog2{
	public String name = "大黄";
	public void cry(){
		System.out.println("I'm jing8,,wangwangwang...");
	}
}

