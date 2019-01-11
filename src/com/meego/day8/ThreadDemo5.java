/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :��Դ����,������ƱԱ���ܹ�100��Ʊ,�߳���
*/
package com.meego.day8;
public class ThreadDemo5 {
	public static void main(String[] args){
		Saler1 s1 = new  Saler1("s1");
		Saler1 s2 = new  Saler1("s2");
		
		s1.start();
		s2.start();
	}
}

class Saler1 extends Thread{
	static int tickets = 100;
	private String name;
	
	public Saler1(String name){
		this.name = name;
	}
	public void run(){
		while(tickets > 0){
			System.out.println(name + "  :  " + (tickets --));
		}
	}
}


