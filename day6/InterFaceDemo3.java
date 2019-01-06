/**
* Filename : InterFaceDemo3.java
* Author : huyn
* Creation time : 下午9:48:28 - 2018年12月25日
* Description :
*/
package com.day6.com;
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
		System.out.println("汪汪汪....");
	}
}

interface Eatable{
	//定义接口 能吃
	public void eated();
}

interface Pet{
	public void peted();
}

class Jing8 extends Dog implements Eatable,Pet{
	String color;
	public void eated(){
		System.out.println("我的肉很香");
	}
	public void peted(){
		System.out.println("我很乖哦!");
	}
}


class Eater{
	public void eat(Eatable e){
		e.eated();
		System.out.println("真香");
	}
}


class Lady{
	public void pet(Pet  p){
		p.peted();
		System.out.println("宠物真乖");
	}
}



