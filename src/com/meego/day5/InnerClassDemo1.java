/**
* Filename : InnerClassDemo1.java
* Author : huyn
* Creation time : ����9:09:28 - 2018��12��24��
* Description :
*/
package com.meego.day5;
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
		//�ܱ����ȵ��
		Engine e = new Engine();
		e.fire("key0001");
		System.out.println("running ~~~");
	}
	
	class Engine{
		//����
		//�ڲ���
		public void fire(String key){
			//���,��ҪԿ��
			System.out.println("key ready..." + key);
			System.out.println("fire...");
		}
	}
}