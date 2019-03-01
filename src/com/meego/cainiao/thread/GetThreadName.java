/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 下午2:02:47 
* @Des:继承 Thread 类并使用 getName() 方法来获取当前线程名称
*/ 

package com.meego.cainiao.thread;
public class GetThreadName extends Thread{
	public void run() {
		for(int i = 0;i < 10;i++) {
			printMsg();
		}
	}
	
	
	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {
		GetThreadName gtn = new GetThreadName();
		gtn.start();
	    for (int i = 0; i < 10; i++) {
	    	gtn.printMsg();
	       }
	}


}

