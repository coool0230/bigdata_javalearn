/**
 * Filename : ThreadDemo2.java
* Author : huyn
* Creation time : 下午4:02:27 - 2018年12月31日
* Description :一共100个馒头,40个工人,每个工人最多能吃三个馒头,
* 使用多线程输出所有工人吃馒头的情况
* 没有做出来
*/


public class WorkerEatSteamed {
	public static void main(String[] args){
		Object lock = new Object();
		Worker w1 = new Worker("w1",lock);
		Worker w2 = new Worker("w2",lock);
		Worker w3 = new Worker("w3",lock);
		Worker w4 = new Worker("w4",lock);
		Worker w5 = new Worker("w5",lock);
		Worker w6 = new Worker("w6",lock);
		Worker w7 = new Worker("w7",lock);
		Worker w8 = new Worker("w8",lock);
		Worker w9 = new Worker("w9",lock);
		Worker w10 = new Worker("w10",lock);
		Worker w11 = new Worker("w11",lock);
		Worker w12 = new Worker("w12",lock);
		Worker w13 = new Worker("w13",lock);
		Worker w14 = new Worker("w14",lock);
		Worker w15 = new Worker("w15",lock);
		
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		w5.start();
		w6.start();
		w7.start();
		w8.start();
		w9.start();
		w10.start();
		w11.start();
		w12.start();
		w13.start();
		w14.start();
		w15.start();

		
		
	}
}

class Worker extends Thread{
	private String name;
	public int num = 1;
	static int steamed  = 100;
	Object lock = new Object();	

	public Worker(String name,Object lock){
		this.name = name;
		this.lock = lock;
		// this.maxnum = maxnum;
	}

	public void run(){
		while(true){
			if(num < 4){
				int s = eatSteamed();
				if(s == -1){
					return;
				}
				else{
						System.out.println(name + " : " + s);
				}
			}
			else{
				try{
					System.out.println(name + " 吃饱了 ");
					break;
				}
				catch(Exception e){
					e.getStackTrace();
				}

			}
			num ++;

		}
	}
	public int eatSteamed(){
		synchronized(lock){
			int s = steamed;
			steamed = steamed - 1;
			return s < 1 ? -1 : s;
//			System.out.println(this.name + "吃了第" + steamed + "馒头");
		}
	}

}







