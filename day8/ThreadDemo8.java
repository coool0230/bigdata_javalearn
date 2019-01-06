/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :资源共享,两个售票员卖总共100张票,引用票池
*/


public class ThreadDemo8 {
	public static void main(String[] args){
		TicketPool pool = new TicketPool();
		Saler s1 = new  Saler("s1",pool);
		Saler s2 = new  Saler("s2",pool);
		
		s1.start();
		s2.start();
	}
}

class Saler extends Thread{
	private String name;
	private TicketPool pool;
	public Saler(String name,TicketPool pool){
	this.name = name;
	this.pool = pool;
	}
	public void run(){
		while(true){
		int no = pool.getTicket();
		if(no == 0){
			return;
		}
		else{
		System.out.println(name + " : " + no);
		}
	}
	}
}


class TicketPool{
	private int tickets = 100;

	public int getTicket(){
		//同步代码块,以票池作为锁旗标
	synchronized(this){
	int temp = tickets;
	tickets = tickets - 1;
	return temp > 0 ? temp : 0;

	
	
		}	
	}
}

