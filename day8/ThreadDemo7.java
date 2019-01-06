/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :资源共享,两个售票员卖总共100张票,不用静态变量
*/


public class ThreadDemo7 {
	public static void main(String[] args){
		Object lock = new Object();
		Saler s1 = new  Saler("s1",lock);
		Saler s2 = new  Saler("s2",lock);
		
		s1.start();
		s2.start();
	}
}

class Saler extends Thread{
	static int tickets = 100;
	//锁旗标
	Object lock = new Object();
	private String name;
	
	public Saler(String name,Object lock){
		this.name = name;
		this.lock = lock;
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
			try{
				Thread.sleep(5);
			}
			catch(Exception e){
				
			}
			tickets = tickets - 1 ;
			return t < 1   ?  -1  :  t ;
		}
	}
}


