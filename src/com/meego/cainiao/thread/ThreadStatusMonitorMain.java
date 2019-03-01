/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 下午2:16:08 
* @Des:继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
*/ 

package com.meego.cainiao.thread;
class ThreadStatusMonitor extends Thread {
	boolean waiting= true;
	boolean ready= false;
	public ThreadStatusMonitor() {
	}

	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " starting.");
	    while(waiting) { 
	        System.out.println("waiting:"+waiting); 
	        System.out.println("waiting...");
	        startWait();
	    }
	    try {
	            Thread.sleep(1000);
	         }
	    catch(Exception e){
	    	System.out.println(thrdName + " interrupted.");
	    }
	    System.out.println(thrdName + " terminating.");
	}
	synchronized void startWait() {
		try {
	         while(!ready) wait();
	      }
	    catch(InterruptedException exc) {
	          System.out.println("wait() interrupted");
	       }
	}
	synchronized void notice() {
		 ready = true;
		 notify();
		   }

}

public class ThreadStatusMonitorMain {
	public static void main(String[] args) throws InterruptedException {
		ThreadStatusMonitor tsm = new ThreadStatusMonitor();
		tsm.setName("MyThread #1");
		showThreadStatus(tsm);
		tsm.start();
	    Thread.sleep(50);
	    showThreadStatus(tsm);
	    tsm.waiting = false;
	    Thread.sleep(50);
	    showThreadStatus(tsm);
	    tsm.notice();
	    Thread.sleep(50);
	    showThreadStatus(tsm);
	    while(tsm.isAlive()) {
	        System.out.println("alive");
	        showThreadStatus(tsm);
	    }
	}
	static void showThreadStatus(Thread thrd) {
	      System.out.println(thrd.getName() + "Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
	   }
}



