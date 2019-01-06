/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :生产者和消费者
*/


public class ThreadDemo10 {
	public static void main(String[] args){
		// TicketPool pool = new TicketPool();
		java.util.List<Integer> l = new java.util.ArrayList<Integer>();
		Productor p = new  Productor("生产者",l);
		Consumer c = new  Consumer("消费者",l);
		
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
			System.out.println(name + " 生产了 : " + i);
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
				System.out.println(name + " 取出了 : " + i);
			}
		}
	}

}




