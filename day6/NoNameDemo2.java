/**
* Filename : NoNameDemo2.java
* Author : huyn
* Creation time : 下午8:56:12 - 2018年12月26日
* Description :匿名抽象类
*/
package com.day6.com;
public class NoNameDemo2 {
	public static void main(String[] args){
		Pet1 pet = new Dog4(){
			public void meng(){
				run();
				System.out.println("ameng");
			}
			public void run(){					//不能外部调用
				System.out.println("跑一圈");
			}
		};
		
		pet.meng();
//		pet.run();							//不能调用,因为Pet类,没有定义run方法;
	}
}

abstract class Pet1{
	abstract public void meng();
}


class Dog4 extends Pet1{
	public void meng(){
		System.out.println("Dog meng");
	}
}