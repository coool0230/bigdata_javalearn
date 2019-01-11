/**
* Filename : ThreadDemo1.java
* Author : huyn
* Creation time : ����3:44:43 - 2018��12��31��
* Description :
*/
package com.meego.day8;
public class ThreadDemo1 {
	public static void main(String[] args){
//		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();
		//run()������CPU���õ�
//		t1.start();
		//run()������CPU���õ�
		t2.start();
	}
}

//�߳�1
//class MyThread extends Thread{
//	public void run(){
//		for(;;){
//			System.out.println("hello world -1");
//		}
//	}
//}


//�߳�2
class YourThread extends Thread{
	public void run(){
		for(;;){
			System.out.println("hello world -2");
		}
	}
}
