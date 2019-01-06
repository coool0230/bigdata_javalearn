/**
* Filename : MantouDemo.java
* Author : huyn
* Creation time : ����8:52:19 - 2019��1��4��
* Description :40�����˳���ͷ
* ÿ����������3����ͷ
* �ܹ�100����ͷ
*/
public class MantouDemo {
	public static void  main(String[] args){
		Basket basket = new Basket();
		for(int j = 0;j < 40;j ++){
			new Worker1("worker - " + j,basket).start();
		}
	}
}


class Worker1 extends Thread{
	private String name;
	private Basket basket;
	private static int Max = 3;
	
	public Worker1(String name,Basket basket){
		this.name = name;
		this.basket = basket;
	}
	
	public void run(){
		int count = 1;
		while(true){
			if(count > Max){
				return ;
			}
			int no = basket.eatManTou();
			if(no > 0){
				count ++;
				System.out.println(name + " : " + no);
			}
		}
	}
	
	
}


class Basket{
	private static int mtNum = 100;
	public static synchronized int eatManTou(){
		int temp = mtNum;
		mtNum --;
		return temp > 0 ? temp : 0;
		
	}
}