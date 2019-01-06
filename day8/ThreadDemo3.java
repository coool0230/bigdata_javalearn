/**
* Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :打麻将,等待所有人结束才可以开局
*/
package com.day8.com;
public class ThreadDemo3 {
	public static void main(String[] args){
		Player p1 = new Player("成龙",3000);
		Player p2 = new Player("李连杰",1000);
		Player p3 = new Player("史泰龙",2000);
		Player p4 = new Player("范冰冰",2500);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		try{
			p1.join();
			p2.join();
			p3.join();
			p4.join();
		}
		catch(Exception e){
			
		}

		
		//所有线程执行完才可以开局
		System.out.println("开局了!!!");
		
	}
}

//线程1
class Player extends Thread{
	private String name;
	private int time;
	public Player(String name,int time){
		this.name = name;
		this.time = time;
		
	}
	public void run(){
		System.out.println(name + "出发了!"); 
		try{
			Thread.sleep(time);
		}
		catch(Exception e){

		}
		System.out.println(name + "到了! 耗时" + time);
	}
}

