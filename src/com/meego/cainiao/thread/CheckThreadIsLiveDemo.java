/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 下午1:49:13 
* @Des:通过继承 Thread 类并使用 isAlive() 方法来检测一个线程是否存活
*/ 

package com.meego.cainiao.thread;
public class CheckThreadIsLiveDemo extends Thread{
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			printMsg("" + i);
		}
	}
	
	public static void printMsg(String s) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {
		CheckThreadIsLiveDemo ctild = new CheckThreadIsLiveDemo();
		ctild.setName("Thread");
	    System.out.println("before start(), ctild.isAlive()=" + ctild.isAlive());
	    ctild.start();
	    System.out.println("just after start(), ctild.isAlive()=" + ctild.isAlive());
	    for (int i = 0; i < 10; i++) {
	    	printMsg("" + i);;
	      }
	    System.out.println("The end of main(), ctild.isAlive()=" + ctild.isAlive());
	}

}

