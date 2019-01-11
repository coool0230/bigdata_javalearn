package com.meego.day8;
/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :�����ߺ�������
*/


public class ThreadDemo10 {
	public static void main(String[] args){
		// TicketPool pool = new TicketPool();
		java.util.List<Integer> l = new java.util.ArrayList<Integer>();
		Productor p = new  Productor("������",l);
		Consumer c = new  Consumer("������",l);
		
		p.start();
		c.start();
	}
}

class Productor extends Thread{
	private String name;
	private java.util.List<Integer> l;

	public Productor(String name,java.util.List<Integer> l){
		this.name = name;
		this.l = l;
	}

	public void run(){
		int i  = 0;
		while(true){
			l.add(new Integer(i++));
			System.out.println(name + " ������ : " + i);
		}
	}

}


class Consumer extends Thread{
	private String name;
	private java.util.List<Integer> l;

	public Consumer(String name,java.util.List<Integer> l){
		this.name = name;
		this.l = l;
	}

	public void run(){
		// int i  = 0;
		while(true){
			if(l.size() > 0){
				int i  = l.remove(0);
				System.out.println(name + " ȡ���� : " + i);
			}
		}
	}

}




