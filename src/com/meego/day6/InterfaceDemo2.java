/**
* Filename : InterfaceDemo2.java
* Author : huyn
* Creation time : ����9:02:43 - 2018��12��25��
* Description :
*/
package com.meego.day6;
public class InterfaceDemo2 {
	public static void main(String[] args){
		Fan f = new Fan();
		Mp3 m = new Mp3();
		Camera camera = new Camera();
		Computer computer = new Computer();
		computer.insert(f);
		computer.insert(m);
		computer.insert(camera);
	}
}

interface Usb{
	public void play();
}

class Mp3 implements Usb{
	public void play(){
		System.out.println("���Ÿ���");
	}
}

class Camera implements Usb{
	public void play(){
		System.out.println("��������");
	}
}

class Fan implements Usb{
	public void play(){
		System.out.println("����");
	}
}


class Computer{
	public  void insert(Usb usb){
		System.out.println("������");
		usb.play();
	}
}