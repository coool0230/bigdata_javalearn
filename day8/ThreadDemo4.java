/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :KTV包房 守护线程Daemon
*/
package com.day8.com;
public class ThreadDemo4 {
	public static void main(String[] args){
		Box no1 = new Box("no1",3000);
		Box no2 = new Box("no2",7000);
		Waiter w = new Waiter();

		//设置服务员线程为守护线程
		w.setDaemon(true);
		
		no1.start();
		no2.start();
		w.start();
		
	}
}

//KTV 包房
class Box extends Thread{
	private String no;
	private int time;
	public Box(String no,int time){
		this.no = no;
		this.time = time;
		
	}
	public void run(){
		System.out.println(no + "号包房开始消费了!"); 
		try{
			Thread.sleep(time);
		}
		catch(Exception e){

		}
		System.out.println(no + "号包房消费时间" + time/1000 + "秒,结束消费!");
	}
}

class Waiter extends Thread{
	public void run(){
		while(true){
			//打印当前系统时间
			System.out.println(new java.util.Date());
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				
			}
		}
	}
}

