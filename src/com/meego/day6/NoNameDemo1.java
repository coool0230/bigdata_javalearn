/**
* Filename : NoNameDemo1.java
* Author : huyn
* Creation time : ����8:38:47 - 2018��12��26��
* Description :�ڲ���
* ��������
*/
package com.meego.day6;
public class NoNameDemo1 {
	public static void main(String[] args){
		WomanStar1 s = new WomanStar1();	//����д��
		
		
		RichMan rm = new RichMan();
		rm.findLover(s);									//����д��
		rm.findLover(new WRB(){					//�����ڲ������
			public void white(){
				System.out.println("����");
			}
		});
	}
}


interface WRB{
	public void white();
}

class WomanStar1 implements WRB{
	public void white(){
		System.out.println("�ܰ�");
	}
}

class RichMan{
	public void findLover(WRB w){
		w.white();
	}
}