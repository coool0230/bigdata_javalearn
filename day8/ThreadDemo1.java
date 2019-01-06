/**
* Filename : ThreadDemo1.java
* Author : huyn
* Creation time : 下午3:44:43 - 2018年12月31日
* Description :
*/
package com.day8.com;
public class ThreadDemo1 {
	public static void main(String[] args){
//		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();
		//run()方法是CPU调用的
//		t1.start();
		//run()方法是CPU调用的
		t2.start();
	}
}

//线程1
//class MyThread extends Thread{
//	public void run(){
//		for(;;){
//			System.out.println("hello world -1");
//		}
//	}
//}


//线程2
class YourThread extends Thread{
	public void run(){
		for(;;){
			System.out.println("hello world -2");
		}
	}
}
