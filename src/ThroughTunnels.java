/**
* Filename : ThroughTunnels.java
* Author : huyn
* Creation time : 下午9:32:45 - 2019年1月2日
* Description :5辆骑车过隧道,隧道一次只能过一辆汽车,每辆汽车通时间不固定,
	机动车通过实践3秒
	三轮车通过时间5秒
	畜力车通过时间10秒
	5辆车分别是2辆机动车,2辆畜力车,一辆三轮车
	通过多线程模拟通过隧道的情况
	提示 car ThreeCar   Cowcar
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
		c1.start();
		c2.start();
		tc1.start();
		cc1.start();
		cc2.start();
		
		
//        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
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
		System.out.println(name + "已经通过了");
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
		System.out.println(name + "已经通过了");
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
		System.out.println(name + "已经通过了");
	}
}


class Tunnels{
	public  void crossTunnel(String name){
		synchronized(this){
			System.out.println(name + "正在通过");
		}
		
	}
}