/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :��Դ����,������ƱԱ���ܹ�100��Ʊ,����Ʊ��,Ʊ����ͬ����̬����
*/


public class ThreadDemo9 {
	public static void main(String[] args){
		// TicketPool pool = new TicketPool();
		Saler s1 = new  Saler("s1");
		Saler s2 = new  Saler("s2");
		
		s1.start();
		s2.start();
	}
}

class Saler extends Thread{
	private String name;
	// private TicketPool pool;
	public Saler(String name){
	this.name = name;
	// this.pool = pool;
	}
	public void run(){
		while(true){
		int no = TicketPool.getTicket();
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
	private static int tickets = 100;

	public synchronized static  int getTicket(){
		//������Ϊ�����,synchronized���η����Է��ڷ���ǰ
	
	int temp = tickets;
	tickets = tickets - 1;
	return temp > 0 ? temp : 0;

	
	}
		
}

