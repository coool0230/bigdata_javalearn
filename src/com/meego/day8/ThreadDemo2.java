/**
* Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :
*/
package com.meego.day8;
public class ThreadDemo2 {
	public static void main(String[] args){
		MyThread t1 = new MyThread("MyThread -1");
		MyThread t2 = new MyThread("MyThread -2");
		//run()������CPU���õ�
		t1.start();
		//run()������CPU���õ�
		t2.start();
	}
}

//�߳�1
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(;;){
			System.out.println(name);
			//yield,����,ǫѷ
			//��̬����
			Thread.yield();
			
		}
	}
}


