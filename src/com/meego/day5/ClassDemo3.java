/**
* Filename : ClassDemo3.java
* Author : huyn
* Creation time : ����8:28:05 - 2018��12��24��
* Description :
*/
package com.meego.day5;
public class ClassDemo3 {
	public static void main(String[] args){
	Jing8 d = new Jing8();
	d.run();
}
}


class Animal{
	String category;
	public Animal(String c){
		System.out.println("new Animal()");
	}
	public final void run(){
		System.out.println("running ~~~");
	}
	
}


class Dog extends Animal{
	String color ;
	public Dog(){
		super("kkkk");
		System.out.println("new Dog()");
	}
}

final class Jing8 extends Dog{
	String blood;
	public Jing8(){
		System.out.println("new Jing8()");
	}
//	public void run(){
//		System.out.println("running ~~~");
//	}
	

}
