/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : ����4:02:27 - 2018��12��31��
* Description :��Դ����,������ƱԱ���ܹ�100��Ʊ,���þ�̬����
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
	//�����
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
	
	//ȡƱ���̼���
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


