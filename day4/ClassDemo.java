/**
* Filename : ClassDemo.java
* Author : huyn
* Creation time : 下午9:28:30 - 2018年12月22日
* Description :
*/
package com.day4.com;
public class ClassDemo {
	public static void main(String[] args){
		//创建对象
		Person p = new Person();  //函数才会用(),每个类都有个默认的和对象同名的构造方法(函数)
		p.run();
		
		
		//匿名对象-1
		new Person().run();			//调用完 直接清除
		//匿名对象 -2,作为参数传递
		run0(new Person());        
		
	}
	public static void run0(Person p){
		p.run();
	}

}
/**
 * 
 * 定义类
 *
 */
class Person{
	//成员变量==属性(property)===字段(field)
	int height;   //身高
	int weight;   //体重
	int age;       //年龄
	public void run(){
		System.out.println(height + "      " +"running");
	}
}
