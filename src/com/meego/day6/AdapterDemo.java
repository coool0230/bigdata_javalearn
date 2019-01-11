/**
* Filename : AdapterDemo.java
* Author : huyn
* Creation time : ����9:34:23 - 2018��12��26��
* Description :
*/
package com.meego.day6;
public class AdapterDemo {
	public static void main(String[] args){
		Button1 b = new Button1();
		//�����ڲ������
		b.addListener(new MouseAdapter1(){
//			public void onClick(){
//				System.out.println("����");
//			}				
//			public void onDbClick(){}
//			public void onRightClick(){}		//��ʵ��
//			public void onMiddleClick(){}		//��ʵ��
		});
		b.click();
		
		
		//���������
		new Button1().addListener(new MouseAdapter1(){
			public void onClick(){
				System.out.println("����������button");
			}
			public void onDbClick(){
				System.out.println("˫��������button");
			}
			
		}).click()					//����button1��click����
		.dbclick();				//����button1��dbClick����
	}
}

class Button1{
	private MouseListener1 l;
	public Button1 addListener(MouseListener1 l){
		this.l = l;
		return this;			//���ض�������
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


//���������
//�����಻��ֱ��new
//�����಻��ʵ����
class MouseAdapter1 implements MouseListener1{
	public void onClick(){
		System.out.println("����");
	}
	public void onDbClick(){}
	public void onRightClick(){}
	public void onMiddleClick(){}
}
