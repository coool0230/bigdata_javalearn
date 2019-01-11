/**
* Filename : ClassDemo3.java
* Author : huyn
* Creation time : ����4:34:48 - 2018��12��23��
* Description :
*/
package com.meego.day4;
public class ClassDemo4 {
	public static void main(String[] args){
		Dog d = new Dog();
		d.setColor("white");
		
		Dog d2 = new Dog("yellow");
		System.out.println(d2.getColor());
	}
}

/**
 * ������
 */

class  Tree{
	//��������
	{
		System.out.println("1.��������");
	}
	//��̬�����
	public static String blood = "��ë";
	static{
		//��̬��Աֻ�ܷ��ʾ�̬��Ա,�޷����ʷǾ�̬��Ա
		//color = "yellow"     ����д��
		System.out.println("1.��̬�����");
		System.out.println(blood);
	}
	private String color;    //��Ա����˽��
//	private int age;
	
	public  void Dog(){
		//�޲ι��캯��
		System.out.println("dog()");
	}
	public  void Dog(String c){
		color = c;					//���ι��캯������
	}
	public  String getColor(){
		return color;
	}
	public  void setColor(String c){
		color = c;
	}
	//��������
	{
		System.out.println("2.��������");
	}
	//��̬�����
	static{
		System.out.println("2.��̬�����");
	}
}
