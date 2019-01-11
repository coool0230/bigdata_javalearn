/**
* Filename : AbstractClassDemo1.java
* Author : huyn
* Creation time : ����9:38:50 - 2018��12��24��
* Description :������
*/
package com.meego.day5;
public class AbstractClassDemo1 {
	public static void main(String[] args){
//		Animal2 a = new Animal2();		//�����಻��ʵ����(��������),�� ����ȫ��ͼֽ,���ܽ��췿��
			Dog2 d = new Dog2();
			d.cry();
	}
}


abstract class Animal2{
	public Animal2(){
		System.out.println("��ʼ����");
	}
//	public void cry();			//���ж���Ľ�����һ��,���Բ����з�����
	abstract public void cry();			//abstract  �������󷽷�

}


class Dog2 extends Animal2{
	//����Լ̳еĸ�������г��󷽷����и���,�ſ���ʵ����
	public void cry(){
		System.out.println("wangwangwang ~~~");
	}
}