/**
* Filename : AbstractClassDemo1.java
* Author : huyn
* Creation time : 下午9:38:50 - 2018年12月24日
* Description :抽象类
*/
package com.day5.com;
public class AbstractClassDemo1 {
	public static void main(String[] args){
//		Animal2 a = new Animal2();		//抽象类不能实例化(创建对象),像 不完全的图纸,不能建造房子
			Dog2 d = new Dog2();
			d.cry();
	}
}


abstract class Animal2{
	public Animal2(){
		System.out.println("开始构造");
	}
//	public void cry();			//所有动物的叫声不一样,所以不能有方法体
	abstract public void cry();			//abstract  声明抽象方法

}


class Dog2 extends Animal2{
	//必须对继承的父类的所有抽象方法进行覆盖,才可以实例化
	public void cry(){
		System.out.println("wangwangwang ~~~");
	}
}