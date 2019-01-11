/**
* Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :���齫,�ȴ������˽����ſ��Կ���
*/
package com.meego.day8;
public class ThreadDemo3 {
	public static void main(String[] args){
		Player p1 = new Player("����",3000);
		Player p2 = new Player("������",1000);
		Player p3 = new Player("ʷ̩��",2000);
		Player p4 = new Player("������",2500);
		
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

		
		//�����߳�ִ����ſ��Կ���
		System.out.println("������!!!");
		
	}
}

//�߳�1
class Player extends Thread{
	private String name;
	private int time;
	public Player(String name,int time){
		this.name = name;
		this.time = time;
		
	}
	public void run(){
		System.out.println(name + "������!"); 
		try{
			Thread.sleep(time);
		}
		catch(Exception e){

		}
		System.out.println(name + "����! ��ʱ" + time);
	}
}

