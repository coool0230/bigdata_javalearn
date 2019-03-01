/** 
* @author:huyn 
* @version 创建时间：2019年3月1日 上午11:16:00 
* @Des:如何通过线程解决生产者/消费者问题
*/ 

package com.meego.cainiao.thread;
public class ProducerAndConsumerDemo {

	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
	    Producer p1 = new Producer(c, 1);
	    Consumer c1 = new Consumer(c, 1);
	    p1.start(); 
	    c1.start();
	}

}

class CubbyHole{
	private int contents;
	private boolean available = false;
	public synchronized int get() {
		while(available =  false) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value) {
	      while (available == true) {
	         try {
	            wait();
	         }
	         catch (InterruptedException e) { 
	         } 
	      }
	      contents = value;
	      available = true;
	      notifyAll();
	   }
}

class Consumer extends Thread{
	private CubbyHole cubbyhole;
	private int number;
	public Consumer(CubbyHole c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   }
	public void run() {
	      int value = 0;
	         for (int i = 0; i < 10; i++) {
	            value = cubbyhole.get();
	            System.out.println("消费者 #" + this.number+ " got: " + value);
	         }
	    }
}

class Producer extends Thread{
	private CubbyHole cubbyhole;
	private int number;

	public Producer(CubbyHole c, int number) {
	   cubbyhole = c;
	   this.number = number;
	   }
	public void run() {
	      for (int i = 0; i < 10; i++) {
	         cubbyhole.put(i);
	         System.out.println("生产者 #" + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      }
	   }
}


