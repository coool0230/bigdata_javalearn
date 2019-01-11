/**
* Filename : PolyDemo2.java
* Author : huyn
* Creation time : ����7:35:43 - 2018��12��26��
* Description :
*/
package com.meego.day6;
public class PolyDemo2 {
	public static void main(String[] args){
		Jing82 jing82 = new Jing82();
//		jing82.name = "���";
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
	public String name = "С��";
	public void cry(){
		System.out.println("wangwangwang...");
	}
}

class Jing82 extends Dog2{
	public String name = "���";
	public void cry(){
		System.out.println("I'm jing8,,wangwangwang...");
	}
}

