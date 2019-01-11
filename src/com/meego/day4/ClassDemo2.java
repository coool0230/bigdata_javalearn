/**
* Filename : ClassDemo2.java
* Author : huyn
* Creation time : ����4:11:49 - 2018��12��23��
* Description :
*/
package com.meego.day4;
public class ClassDemo2 {
	public static  void main(String[] args){
		RichMan wsc = new RichMan();
//		wsc.money = 100000000;
		wsc.setMoney(100);
		System.out.println(wsc.getMoney());
				
	}

}

/**
 *  ������
 *
 */

class RichMan{
	//�޲εĹ��캯��
	public RichMan(){
		
	}
	 private int money = 10 ;   //˽�г�Ա����,��Ա����  һ������Ϊ˽��,����������,ͨ������������ 
	 
	 public int getMoney(){
		 return money;
	 }
	 public void setMoney(int m){
		 if(m > money){
			 money = m;
		 }
	 }
}
