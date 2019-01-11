/**
* Filename : NoNameDemo3.java
* Author : huyn
* Creation time : ����9:10:14 - 2018��12��26��
* Description :GUI �����������
* ���������
*/
package com.meego.day6;
public class MouseAdapterDemo {
	public static void main(String[] args){
		Button b1 = new Button();
		b1.addListener(new MouseAdapter(){
			public void onClick(){
				System.out.println("����");
			}
			public void onDoubleClick(){
				System.out.println("˫��");
			}
		});
		b1.click();
		b1.dbClick();
	}
}


//��ť
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


//���������ӿ�
interface MouseListener{
	public void onClick();						//�����¼�
	public void onDoubleClick();			//˫���¼�
	public void rightClick();
	public void xxxClick();
}


//���������,��һ���������һ���ܶ෽���Ĳ����õķ���ʵ����
abstract class MouseAdapter implements MouseListener{
	public void rightClick(){
		
	}
	public void xxxClick(){
		
	}
}