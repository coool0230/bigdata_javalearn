/**
* Filename : BearAndBee.java
* Author : huyn
* Creation time : ����11:12:43 - 2019��1��2��
* Description :
* 	�ö��߳�ģ���۷���ܵĹ�ϵ
	�۷��������ߣ����������ߡ��۷������������ۼӵĹ���,���Ƿ���������(��100�Ե�)�Ĺ���.
	�����ߺ�������֮��ʹ��֪ͨ��ʽ��֪�Է�,ע�ⲻ�ܳ�������������
	100ֵ�۷�,ÿ�������ķ��۶���1
	�ܳԷ�����20(���������)
*/
//public class BearAndBee {
//	public static void main(String[] args){
////		java.util.List<Integer> list = new java.util.ArrayList<Integer>();
//		HoneyPot honeypot = new HoneyPot();
//		for(int k = 0; k < 100;k++){
//			new Bee("bee--" + k,honeypot).start();
//		}
//		for(int h = 0; h < 100;h++){
//			new Bear("bearXXXXXXXXXXXXXXXXXXXXXXXXXXXX--" + h,honeypot).start();
//		}
//		
//		
//		
//	}
//}
//
//class Bee extends Thread{
//	private String name;
////	private java.util.List<Integer> list;
//	private HoneyPot hp;
//	
//	public Bee(String name,HoneyPot hp){
//		this.name = name;
//		this.hp = hp;
//	}
//	
//	
//	public void run(){
//		while(true){
//			hp.addHoney();
//		}
//	}
//}
//
//
//class Bear extends Thread{
//	private String name;
//	private java.util.List<Integer> list;
//	private HoneyPot hp;
//	
//	public Bear(String name,HoneyPot hp){
//		this.name = name;
//		this.hp = hp;
//	}
//	
//	public void run(){
//		while(true){
//			if(list.size() > 20){
//				int[] arr = hp.removeHoney(); 			
//				for(int k = 0;k < 20;k++){
//					System.out.println(name + "���� : " + arr[k]);
//				}
//			}
//			else{
//				try{
//					this.wait();
//				}
//				catch(Exception e){
//					e.printStackTrace();
//				}
//			}
//		}	
//	}
//}
//
//class HoneyPot{
//	static java.util.List<Integer> list = new java.util.ArrayList<Integer>();
//	static int i = 0;
//	public void addHoney(){
//		synchronized(this){
//			int t = i++;
//			list.add(new Integer(t));
//		}
//
////		System.out.println(name + " ������ : " + i);
//	}
//	public  int[] removeHoney(){
//		synchronized(this){
//			int[] arr = new int[20];
//			for(int j = 0;j < 20; j++){
//				arr[j] = list.remove(j);
//			}
//			return arr;
//		}
//
//	}
//	
//}


class BearAndBee{
	public static void main(String[] args){
		Pot pot = new Pot();
		for(int j = 1;j <=  100; j ++){
			new Bee("bee--" + j,pot).start();;
		}
		new Bear("xiong---------------------------1",pot).start();
		new Bear("xiong---------------------------2",pot).start();
	}
}



class Bee extends Thread{
	private String name;
	static Pot pot;
	
	public Bee(String name,Pot pot){
		this.name = name;
		this.pot = pot;
	}
	
	public void run(){
		while(true){
			int no = pot.addHoney();
			System.out.println(name + "������ :  1,pot : " + no);	
		}

	}
}

class Bear extends Thread{
	private String name;
	private Pot pot;
	
	public Bear(String name,Pot pot){
		this.name = name;
		this.pot = pot;
	}
	
	public void run(){
		while(true){
			pot.removeHoney();
			System.out.println( name +  " �Ե��˷��� :  20");
		}
	}
}


class Pot{
	private int max = 20;
	private int count ;
	
	public synchronized  int addHoney(){
		while(count >= max){
			try{
				this.notify();
				this.wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return ++count;
	}
	
	public synchronized  void removeHoney(){
		while(count < max){
			try {
//				this.notify();
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		count = 0;
		this.notify();
	}
}

