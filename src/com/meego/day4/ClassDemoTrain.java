/**
* Filename : ClassDemoTrain.java
* Author : huyn
* Creation time : ����4:48:31 - 2018��12��23��
* Description :
*/
package com.meego.day4;
public class ClassDemoTrain {
	public static void main(String[] args){
//		Car benz = new Car(); //�޲ι���
//		benz.setColor("sliver");
//		benz.setTires(4);
//		System.out.println(benz.getColor() + "  "  + benz.getTires());
//		Car audi = new Car("black");
//		System.out.println(audi.getColor());
		
		Car byd = new Car("white" ,8);
		System.out.println(byd.getColor() + "  "  + byd.getTires());
		
	}
}


class Car{
	private String color;
	private int tires;
	
	public Car(){
		//�޲ι��캯��
	}
	public Car(String c){
		setColor(c);
	}
	public Car(String c,int t){
		setColor(c);
		setTires(t);
	}

	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color = c;
	}
	public int getTires(){
		return tires;
	}
	public void setTires(int t){
		tires = t;
	}
	
	
}