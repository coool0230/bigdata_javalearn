/**
* Filename : InnerDemo.java
* Author : huyn
* Creation time : 下午8:14:34 - 2018年12月25日
* Description :
*/
package com.day6.com;
public class InnerDemo {
	public static void main(String[] args){
		Benz.Engine e = new Benz.Engine();
		e.fire();
	}

}

class Benz{
	private String color;
	private int tires;
	//内部类被staic 修饰后可以直接实例化
	static class Engine{
		public void fire(){
			System.out.println("fire....");
		}
	}
}
