/**
* Filename : NoNameDemo3.java
* Author : huyn
* Creation time : 下午9:10:14 - 2018年12月26日
* Description :GUI 经典面向对象
* 鼠标适配器
*/
package com.day6.com;
public class MouseAdapterDemo {
	public static void main(String[] args){
		Button b1 = new Button();
		b1.addListener(new MouseAdapter(){
			public void onClick(){
				System.out.println("单击");
			}
			public void onDoubleClick(){
				System.out.println("双击");
			}
		});
		b1.click();
		b1.dbClick();
	}
}


//按钮
class Button{
	private MouseListener listener;
	
	public void addListener(MouseListener listener){
		this.listener = listener;
	}
	
	public void click(){
		listener.onClick();
	}
	
	
	public void dbClick(){
		listener.onDoubleClick();
	}
}


//鼠标监听器接口
interface MouseListener{
	public void onClick();						//单击事件
	public void onDoubleClick();			//双击事件
	public void rightClick();
	public void xxxClick();
}


//鼠标适配器,用一个抽象类把一个很多方法的不常用的方法实现了
abstract class MouseAdapter implements MouseListener{
	public void rightClick(){
		
	}
	public void xxxClick(){
		
	}
}