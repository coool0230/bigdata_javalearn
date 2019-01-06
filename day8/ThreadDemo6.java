/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :资源共享,两个售票员卖总共100张票
*/

public class ThreadDemo6 {
	public static void main(String[] args){
		Saler s1 = new  Saler("s1");
		Saler s2 = new  Saler("s2");
		
		s1.start();
		s2.start();
	}
}

class Saler extends Thread{
	static int tickets = 100;
	//锁旗标
	static Object lock = new Object();			//静态变量
	private String name;
	
	public Saler(String name){
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
	
	//取票过程加锁
	public int getTicket(){
		synchronized(lock){
			int t = tickets ;
			tickets = tickets - 1 ;
			return t < 1   ?  -1  :  t ;
		}
	}
}


