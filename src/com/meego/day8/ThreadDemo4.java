/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :KTV���� �ػ��߳�Daemon
*/
package com.meego.day8;
public class ThreadDemo4 {
	public static void main(String[] args){
		Box no1 = new Box("no1",3000);
		Box no2 = new Box("no2",7000);
		Waiter w = new Waiter();

		//���÷���Ա�߳�Ϊ�ػ��߳�
		w.setDaemon(true);
		
		no1.start();
		no2.start();
		w.start();
		
	}
}

//KTV ����
class Box extends Thread{
	private String no;
	private int time;
	public Box(String no,int time){
		this.no = no;
		this.time = time;
		
	}
	public void run(){
		System.out.println(no + "�Ű�����ʼ������!"); 
		try{
			Thread.sleep(time);
		}
		catch(Exception e){

		}
		System.out.println(no + "�Ű�������ʱ��" + time/1000 + "��,��������!");
	}
}

class Waiter extends Thread{
	public void run(){
		while(true){
			//��ӡ��ǰϵͳʱ��
			System.out.println(new java.util.Date());
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				
			}
		}
	}
}

