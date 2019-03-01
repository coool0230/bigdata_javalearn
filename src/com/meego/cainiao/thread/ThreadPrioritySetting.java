/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 下午2:59:49 
* @Des:通过setPriority() 方法来设置线程的优先级
*/ 

package com.meego.cainiao.thread;
public class ThreadPrioritySetting extends Thread{
	private int countDown = 5;
	private volatile double d = 0;
	public  ThreadPrioritySetting(int priority) {
	      setPriority(priority);
	      start();
	   }
	public String toString() {
	      return super.toString() + ": " + countDown;
	   }
	public void run() {
//		System.out.println(this);
	      while(true) {
	         for(int i = 1; i < 10; i++) {
		         d = d + (Math.PI + Math.E) / (double)i;
		         System.out.println(this);
		         if(--countDown == 0) {
		        	 return;
		         }
	         }

	      }
	   }
	public static void main(String[] args) {
		new ThreadPrioritySetting(Thread.MAX_PRIORITY);
	    for(int i = 0; i < 5; i++) {
	    	new ThreadPrioritySetting(Thread.MIN_PRIORITY);
	    }
	    
	}

}

