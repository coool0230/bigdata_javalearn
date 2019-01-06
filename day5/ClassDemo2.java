/**
* Filename : ClassDemo2.java
* Author : huyn
* Creation time : 下午10:36:26 - 2018年12月23日
* Description :
*/
package com.day5.com;
public class ClassDemo2 {
	public static void main(String[] args){
		Son s1 = new Son();
		s1.eat();
		s1.run();
//		s1.asset = 100000;             //父类的私有变量,子类不能访问
		s1.asset1 = 100000;
		System.out.println(s1.getAsset());
	}
}


class Father{
	String name;
	private int asset =9990;               //资产
	public int  asset1;               //资产
	private void eat(){
		//类的私有方法,只能在类本身中调用
		System.out.println("洗手");
	}
	public static void walk(){
		//静态方法,子类覆盖时必须是静态方法
		//非静态方法,子类覆盖时也必须是非静态方法
		System.out.println("walking ~~~");
	}
	public int getAsset(){
		return this.asset;
	}
	public void setAsset(int asset){
		this.asset = asset;
	}
}


class Son extends Father{
	public void eat(){
		//如果父类的方法是private方法,则super.xxx 不可以访问,私有方法不会被继承
//		super.eat();                     //调用父类的方法
		System.out.println("洗澡");
	}
	public static void run(){
		Father.walk();                               //ok
		walk();                           //ok
		System.out.println("running ~~~");
	}
}