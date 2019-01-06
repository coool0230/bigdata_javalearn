/**
* Filename : ClassDemoTrain.java
* Author : huyn
* Creation time : 下午4:48:31 - 2018年12月23日
* Description :
*/
package com.day4.com;
public class ClassDemoTrain {
	public static void main(String[] args){
//		Car benz = new Car(); //无参构造
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
		//无参构造函数
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