/**
* Filename : ClassDemo5.java
* Author : huyn
* Creation time : 下午6:40:05 - 2018年12月23日
* Description :继承
*/
package com.day4.com;
public class ClassDemo5 {
	public static void main(String[] args){
		Cat d = new Cat();
		d.color = "yellow";
		System.out.println(d.color);
	}

}

class Animal{
	String color;
	int height;
}

/**
 * 继承 ,extends,throw,throws
 * @author MyPC
 *
 */

class Cat extends Animal{
	
}