/**
* Filename : PolyDemo1.java
* Author : huyn
* Creation time : ����10:47:47 - 2018��12��25��
* Description :��̬
*/
package com.meego.day6;
public class PolyDemo1 {
	public static void main(String[] args){
		Dog1 d1 = new Dog1();
		d1.cry();
		
		Animal1 d2 = new Dog1();
		d2.cry();
		
//		Object o1 = new Dog1();
//		o1.cry();
}
}

 
abstract class Animal1{
	abstract void cry();
}


class Dog1 extends Animal1{
	public void cry(){
		System.out.println("������......");
	}
}