/**
* Filename : InnerDemo.java
* Author : huyn
* Creation time : ����8:14:34 - 2018��12��25��
* Description :
*/
package com.meego.day6;
public class InnerDemo {
	public static void main(String[] args){
		Benz.Engine e = new Benz.Engine();
		e.fire();
	}

}

class Benz{
	private String color;
	private int tires;
	//�ڲ��౻staic ���κ����ֱ��ʵ����
	static class Engine{
		public void fire(){
			System.out.println("fire....");
		}
	}
}
