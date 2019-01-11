/**
* Filename : InnerClassDemo1.java
* Author : huyn
* Creation time : ����9:09:28 - 2018��12��24��
* Description :
*/
package com.meego.day5;
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
			//����
			//�ڲ���
			public void fire(){
				//���,��ҪԿ��
//				key = "KEY8888";        //�ڲ��಻�ܶԾֲ��������¸�ֵ
				System.out.println("key ready..." + key);
				System.out.println("fire...");
			}
		}
//		System.out.println("running ~~~");
		//�ܱ����ȵ��
		Engine e = new Engine();
		e.fire();
		System.out.println("running ~~~");
	}
	

}