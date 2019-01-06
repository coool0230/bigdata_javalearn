/**
* Filename : ClassDemo2.java
* Author : huyn
* Creation time : 下午4:11:49 - 2018年12月23日
* Description :
*/
package com.day4.com;
public class ClassDemo2 {
	public static  void main(String[] args){
		RichMan wsc = new RichMan();
//		wsc.money = 100000000;
		wsc.setMoney(100);
		System.out.println(wsc.getMoney());
				
	}

}

/**
 *  定义类
 *
 */

class RichMan{
	//无参的构造函数
	public RichMan(){
		
	}
	 private int money = 10 ;   //私有成员变量,成员变量  一般设置为私有,把属性隐藏,通过方法来访问 
	 
	 public int getMoney(){
		 return money;
	 }
	 public void setMoney(int m){
		 if(m > money){
			 money = m;
		 }
	 }
}
