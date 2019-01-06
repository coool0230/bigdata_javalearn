/**
* Filename : ClassDemo.java
* Author : huyn
* Creation time : 下午9:20:07 - 2018年12月23日
* Description :
*/
package com.day5.com;
public class ClassDemo {
	public static void main(String[] args){ 
		//new 必须跟构造函数
		Car c1 = new Car();
		c1.run();
		Car c2 = new Car();
		c2.Car("yellow"); //error   构造函数只能通过new 来运行
		
		System.out.println(Benz.BRAND);   //静态变量不用创建对象就可以访问
	}
}

class Car{
	String color;
	int tires;
	int productDate;
	
	public void Car(String color){
		//这不是构造函数,因为构造函数没有返回值,构造函数一定没有返回值
		//普通函数小写字母开头,第二个单词首字母大写
		//只有构造函数才可以没有返回值
		this.color = color;
	}
	public Car(){
//		new Car();//递归,栈溢出
	}
	public Car(String color){
		this.color = color;
		System.out.println("asdfasf");
	}
	void run(){
		System.out.println("running ~~~");
	}
}


//public                  公有
//----private           私有的成员,只有类本身可以访问
class Benz extends Car{
	static String BRAND = "Benz";  //类中的静态变量
	
	public static String getBrand(){
//		return this.Brand;                  //静态变量不能用this
		return BRAND;
	}
}
