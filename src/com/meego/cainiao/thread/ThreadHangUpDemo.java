/** 
* @author:huyn 
* @version 创建时间：2019年3月1日 上午10:56:23 
* @Des:将线程挂起
*/ 

package com.meego.cainiao.thread;
public class ThreadHangUpDemo extends Thread{
	private int countDown = 5;
	private static int threadCount = 0;
	public ThreadHangUpDemo() {
	    super("" + ++threadCount);
	    start();
	}
	
	public String toString() { 
	   return "#" + getName() + ": " + countDown;
	   }
	public void run() {
	      while (true) {
	         System.out.println(this);
	         if (--countDown == 0)
	            return;
	         try {
	            sleep(100);
	         }
	         catch (InterruptedException e) {
	            throw new RuntimeException(e);
	         }
	      }
	   }
	public static void main(String[] args) throws InterruptedException {
	    for (int i = 0; i < 5; i++) {
	    	new ThreadHangUpDemo().join();
	    }
	       
	    System.out.println("线程已被挂起");
	}

}

