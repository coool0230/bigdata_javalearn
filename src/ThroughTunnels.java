/**
* Filename : ThroughTunnels.java
* Author : huyn
* Creation time : ����9:32:45 - 2019��1��2��
* Description :5���ﳵ�����,���һ��ֻ�ܹ�һ������,ÿ������ͨʱ�䲻�̶�,
	������ͨ��ʵ��3��
	���ֳ�ͨ��ʱ��5��
	������ͨ��ʱ��10��
	5�����ֱ���2��������,2��������,һ�����ֳ�
	ͨ�����߳�ģ��ͨ����������
	��ʾ car ThreeCar   Cowcar
*/


import java.util.Date;
import java.text.SimpleDateFormat;

public class ThroughTunnels {
	public static void main(String[] args){
		Tunnels tunnel = new Tunnels();
		Car c1 = new Car("car1",tunnel);
		Car c2 = new Car("car2",tunnel);
		Car tc1 = new Car("Threecar1",tunnel);
		Car cc1 = new Car("cowcar1",tunnel);
		Car cc2 = new Car("cowcar2",tunnel);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		
		c1.start();
		c2.start();
		tc1.start();
		cc1.start();
		cc2.start();
		
		
//        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
//        System.out.println(df1.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
	}
}

class Car extends Thread{
	private String name;
	private Tunnels  tunnel;
	public Car(String name,Tunnels tunnel){
		this.name = name;
		this.tunnel = tunnel;
	}
	public void run(){
		tunnel.crossTunnel(name);
		try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "�Ѿ�ͨ����");
	}
	
}


class ThreeCar extends Thread{
	private String name;
	private Tunnels tunnel;
	public ThreeCar(String name,Tunnels tunnel){
		this.name = name;
		this.tunnel = tunnel;
	}
	public void run(){
		tunnel.crossTunnel(name);
		try {
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "�Ѿ�ͨ����");
	}
	
}


class CowCar extends Thread{
	private String name;
	private Tunnels tunnel;
	public CowCar(String name,Tunnels tunnel){
		this.name = name;
		this.tunnel = tunnel;
	}
	public void run(){
		tunnel.crossTunnel(name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "�Ѿ�ͨ����");
	}
}


class Tunnels{
	public  void crossTunnel(String name){
		synchronized(this){
			System.out.println(name + "����ͨ��");
		}
		
	}
}