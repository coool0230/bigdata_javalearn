/**
* Filename : PolyDemo3.java
* Author : huyn
* Creation time : ����7:49:41 - 2018��12��26��
* Description :
*/
package com.meego.day6;
public class PolyDemo3 {
	public static void main(String[] args){
		Car benz = new Benz3();
//		String res = benz.getColor();
//		benz.setColor("red");
		System.out.println(benz.getColor());
		
		
		Benz3 benz1 = new Benz3();
		System.out.println(benz1.getColor());
		
	}
}


class Car{
	private String  color = "null";
	public String getColor(){
		return color;
		
	}
	
	public void setColor(String color){
		this.color = color;
//		return this.color;
	}
}

class Benz3 extends Car{
	private String color = "black";
   
}
