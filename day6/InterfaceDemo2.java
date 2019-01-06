/**
* Filename : InterfaceDemo2.java
* Author : huyn
* Creation time : 下午9:02:43 - 2018年12月25日
* Description :
*/
package com.day6.com;
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
		System.out.println("播放歌曲");
	}
}

class Camera implements Usb{
	public void play(){
		System.out.println("咔嚓咔嚓");
	}
}

class Fan implements Usb{
	public void play(){
		System.out.println("吹风");
	}
}


class Computer{
	public  void insert(Usb usb){
		System.out.println("插入了");
		usb.play();
	}
}