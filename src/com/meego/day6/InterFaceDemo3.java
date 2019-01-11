/**
* Filename : InterFaceDemo3.java
* Author : huyn
* Creation time : ����9:48:28 - 2018��12��25��
* Description :
*/
package com.meego.day6;
public class InterFaceDemo3 {
	public static void main(String[] args){
		Lady l = new Lady();
		Eater eater = new Eater();
		Jing8 j88 = new Jing8();
		l.pet(j88);
		eater.eat(j88);
	}

}

abstract class Animal{
	abstract void cry();
}

class Dog extends Animal{
	void cry(){
		System.out.println("������....");
	}
}

interface Eatable{
	//����ӿ� �ܳ�
	public void eated();
}

interface Pet{
	public void peted();
}

class Jing8 extends Dog implements Eatable,Pet{
	String color;
	public void eated(){
		System.out.println("�ҵ������");
	}
	public void peted(){
		System.out.println("�Һܹ�Ŷ!");
	}
}


class Eater{
	public void eat(Eatable e){
		e.eated();
		System.out.println("����");
	}
}


class Lady{
	public void pet(Pet  p){
		p.peted();
		System.out.println("�������");
	}
}



