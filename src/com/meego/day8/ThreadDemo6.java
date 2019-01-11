package com.meego.day8;
/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :��Դ����,������ƱԱ���ܹ�100��Ʊ
*/

public class ThreadDemo6 {
	public static void main(String[] args){
		Saler2 s1 = new  Saler2("s1");
		Saler2 s2 = new  Saler2("s2");
		
		s1.start();
		s2.start();
	}
}

class Saler2 extends Thread{
	static int tickets = 100;
	//�����
	static Object lock = new Object();			//��̬����
	private String name;
	
	public Saler2(String name){
		this.name = name;
	}
	public void run(){
		while(true){
			int t = getTicket();
			if(t == -1){
				return ;
			}
			else{
				System.out.println(name + "  :  " + t);
			}
		}
	}
	
	//ȡƱ���̼���
	public int getTicket(){
		synchronized(lock){
			int t = tickets ;
			tickets = tickets - 1 ;
			return t < 1   ?  -1  :  t ;
		}
	}
}


