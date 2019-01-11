/**
* Filename : ClassDemo.java
* Author : huyn
* Creation time : ����9:28:30 - 2018��12��22��
* Description :
*/
package com.meego.day4;
public class ClassDemo {
	public static void main(String[] args){
		//��������
		Person p = new Person();  //�����Ż���(),ÿ���඼�и�Ĭ�ϵĺͶ���ͬ���Ĺ��췽��(����)
		p.run();
		
		
		//��������-1
		new Person().run();			//������ ֱ�����
		//�������� -2,��Ϊ��������
		run0(new Person());        
		
	}
	public static void run0(Person p){
		p.run();
	}

}
/**
 * 
 * ������
 *
 */
class Person{
	//��Ա����==����(property)===�ֶ�(field)
	int height;   //���
	int weight;   //����
	int age;       //����
	public void run(){
		System.out.println(height + "      " +"running");
	}
}
