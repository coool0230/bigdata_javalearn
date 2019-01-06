/**
* Filename : NoNameDemo1.java
* Author : huyn
* Creation time : 下午8:38:47 - 2018年12月26日
* Description :内部类
* 土豪征婚
*/
package com.day6.com;
public class NoNameDemo1 {
	public static void main(String[] args){
		WomanStar1 s = new WomanStar1();	//常规写法
		
		
		RichMan rm = new RichMan();
		rm.findLover(s);									//常规写法
		rm.findLover(new WRB(){					//匿名内部类对象
			public void white(){
				System.out.println("很美");
			}
		});
	}
}


interface WRB{
	public void white();
}

class WomanStar1 implements WRB{
	public void white(){
		System.out.println("很白");
	}
}

class RichMan{
	public void findLover(WRB w){
		w.white();
	}
}