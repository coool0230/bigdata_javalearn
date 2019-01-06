/**
* Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :
*/
package com.day8.com;
public class ThreadDemo2 {
	public static void main(String[] args){
		MyThread t1 = new MyThread("MyThread -1");
		MyThread t2 = new MyThread("MyThread -2");
		//run()方法是CPU调用的
		t1.start();
		//run()方法是CPU调用的
		t2.start();
	}
}

//线程1
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(;;){
			System.out.println(name);
			//yield,放弃,谦逊
			//静态方法
			Thread.yield();
			
		}
	}
}


