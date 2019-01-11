/**
* Filename : ClassDemo2.java
* Author : huyn
* Creation time : ����10:36:26 - 2018��12��23��
* Description :
*/
package com.meego.day5;
public class ClassDemo2 {
	public static void main(String[] args){
		Son s1 = new Son();
		s1.eat();
		s1.run();
//		s1.asset = 100000;             //�����˽�б���,���಻�ܷ���
		s1.asset1 = 100000;
		System.out.println(s1.getAsset());
	}
}


class Father{
	String name;
	private int asset =9990;               //�ʲ�
	public int  asset1;               //�ʲ�
	private void eat(){
		//���˽�з���,ֻ�����౾���е���
		System.out.println("ϴ��");
	}
	public static void walk(){
		//��̬����,���า��ʱ�����Ǿ�̬����
		//�Ǿ�̬����,���า��ʱҲ�����ǷǾ�̬����
		System.out.println("walking ~~~");
	}
	public int getAsset(){
		return this.asset;
	}
	public void setAsset(int asset){
		this.asset = asset;
	}
}


class Son extends Father{
	public void eat(){
		//�������ķ�����private����,��super.xxx �����Է���,˽�з������ᱻ�̳�
//		super.eat();                     //���ø���ķ���
		System.out.println("ϴ��");
	}
	public static void run(){
		Father.walk();                               //ok
		walk();                           //ok
		System.out.println("running ~~~");
	}
}