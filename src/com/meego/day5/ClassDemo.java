/**
* Filename : ClassDemo.java
* Author : huyn
* Creation time : ����9:20:07 - 2018��12��23��
* Description :
*/
package com.meego.day5;
public class ClassDemo {
	public static void main(String[] args){ 
		//new ��������캯��
		Car c1 = new Car();
		c1.run();
		Car c2 = new Car();
		c2.Car("yellow"); //error   ���캯��ֻ��ͨ��new ������
		
		System.out.println(Benz.BRAND);   //��̬�������ô�������Ϳ��Է���
	}
}

class Car{
	String color;
	int tires;
	int productDate;
	
	public void Car(String color){
		//�ⲻ�ǹ��캯��,��Ϊ���캯��û�з���ֵ,���캯��һ��û�з���ֵ
		//��ͨ����Сд��ĸ��ͷ,�ڶ�����������ĸ��д
		//ֻ�й��캯���ſ���û�з���ֵ
		this.color = color;
	}
	public Car(){
//		new Car();//�ݹ�,ջ���
	}
	public Car(String color){
		this.color = color;
		System.out.println("asdfasf");
	}
	void run(){
		System.out.println("running ~~~");
	}
}


//public                  ����
//----private           ˽�еĳ�Ա,ֻ���౾����Է���
class Benz extends Car{
	static String BRAND = "Benz";  //���еľ�̬����
	
	public static String getBrand(){
//		return this.Brand;                  //��̬����������this
		return BRAND;
	}
}
