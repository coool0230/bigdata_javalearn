/**
* Filename : InterFaceDemo.java
* Author : huyn
* Creation time : ����8:47:46 - 2018��12��25��
* Description :
*/
package com.meego.day6;
public class InterFaceDemo {
	public static void main(String[] args){
		WomanStar ws = new WomanStar();
		ws.white();
		ws.rich();
		TuHao tuhao = new TuHao();
		tuhao.marry(ws);
		KoreanMan m1 = new KoreanMan();
		tuhao.marry(m1);
	}
}
//����ӿ�
interface White{
	//�ӿ���ȫ�ǳ��󷽷�
	//�׷���
	public void white();
	//�����Ա�����Ļ� �����ǳ���
}

interface Rich{
	public void rich();
}

interface Beautiful{
	public void beautiful();
}

//��ʵ�ֽӿ�
class WomanStar implements White,Rich{
	public void white(){
		System.out.println("white.....");
	};
	public void rich(){
		System.out.println("rich.....");
	};
}


class TuHao{
	//��������,Ҫ���
	//White�ǽӿ�
	public void marry(White w){
		w.white();
	}
}

class KoreanMan implements White{
	//������Ҳ�ܰ�
	public void white(){
		System.out.println("����С��");
	}
}