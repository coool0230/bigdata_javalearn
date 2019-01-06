/**
* Filename : ClassDemo3.java
* Author : huyn
* Creation time : 下午4:34:48 - 2018年12月23日
* Description :
*/
//package com.day4.com;
public class ClassDemo3 {
	public static void main(String[] args){
		Dog d = new Dog();
		d.setColor("white");
		
		Dog d2 = new Dog("yellow");
		System.out.println(d2.getColor());
	}
}

/**
 * 定义类
 */

class Dog{
	//构造代码块
	{
		System.out.println("1.构造代码块");
	}
	//静态代码块
	public static String blood = "金毛";
	static{
		//静态成员只能访问静态成员,无法访问非静态成员
		//color = "yellow"     错误写法
		System.out.println("1.静态代码块");
		System.out.println(blood);
	}
	private String color;    //成员变量私有
	private int age;
	
	public Dog(){
		//无参构造函数
		System.out.println("dog()");
	}
	public Dog(String c){
		color = c;					//带参构造函数重载
	}
	public  String getColor(){
		return color;
	}
	public  void setColor(String c){
		color = c;
	}
	//构造代码块
	{
		System.out.println("2.构造代码块");
	}
	//静态代码块
	static{
		System.out.println("2.静态代码块");
	}
}
