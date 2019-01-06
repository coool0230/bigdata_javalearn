/**
* Filename : InnerClassDemo1.java
* Author : huyn
* Creation time : 下午9:09:28 - 2018年12月24日
* Description :
*/
package com.day5.com;
public class InnerClassDemo2 {
	public static void main(String[] args){
		Benz2 benz = new Benz2();
		benz.run();
	}
}


class Benz2{
	String color;
	int tires;
	public void run(){
		String key = "KEY9999";
		class Engine{
			//引擎
			//内部类
			public void fire(){
				//点火,需要钥匙
//				key = "KEY8888";        //内部类不能对局部变量重新赋值
				System.out.println("key ready..." + key);
				System.out.println("fire...");
			}
		}
//		System.out.println("running ~~~");
		//跑必须先点火
		Engine e = new Engine();
		e.fire();
		System.out.println("running ~~~");
	}
	

}