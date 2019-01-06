/**
* Filename : InnerClassDemo1.java
* Author : huyn
* Creation time : 下午9:09:28 - 2018年12月24日
* Description :
*/
package com.day5.com;
public class InnerClassDemo1 {
	public static void main(String[] args){
		Benz1 benz = new Benz1();
		benz.run();
	}
}


class Benz1{
	String color;
	int tires;
	public void run(){
//		System.out.println("running ~~~");
		//跑必须先点火
		Engine e = new Engine();
		e.fire("key0001");
		System.out.println("running ~~~");
	}
	
	class Engine{
		//引擎
		//内部类
		public void fire(String key){
			//点火,需要钥匙
			System.out.println("key ready..." + key);
			System.out.println("fire...");
		}
	}
}