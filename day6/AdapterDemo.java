/**
* Filename : AdapterDemo.java
* Author : huyn
* Creation time : 下午9:34:23 - 2018年12月26日
* Description :
*/
package com.day6.com;
public class AdapterDemo {
	public static void main(String[] args){
		Button1 b = new Button1();
		//匿名内部类对象
		b.addListener(new MouseAdapter1(){
//			public void onClick(){
//				System.out.println("单击");
//			}				
//			public void onDbClick(){}
//			public void onRightClick(){}		//空实现
//			public void onMiddleClick(){}		//空实现
		});
		b.click();
		
		
		//方法链编程
		new Button1().addListener(new MouseAdapter1(){
			public void onClick(){
				System.out.println("单击了匿名button");
			}
			public void onDbClick(){
				System.out.println("双击了匿名button");
			}
			
		}).click()					//调用button1的click方法
		.dbclick();				//调用button1的dbClick方法
	}
}

class Button1{
	private MouseListener1 l;
	public Button1 addListener(MouseListener1 l){
		this.l = l;
		return this;			//返回对象自身
	}

		public Button1 click(){
			l.onClick();
			return this;
		}
		public void dbclick(){
			l.onDbClick();
		}
	
}

interface MouseListener1{
	public void onClick();
	public void onDbClick();
	public void onRightClick();
	public void onMiddleClick();
}


//鼠标适配器
//抽象类不能直接new
//抽象类不能实例化
class MouseAdapter1 implements MouseListener1{
	public void onClick(){
		System.out.println("单击");
	}
	public void onDbClick(){}
	public void onRightClick(){}
	public void onMiddleClick(){}
}
