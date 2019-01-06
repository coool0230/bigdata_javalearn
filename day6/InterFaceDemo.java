/**
* Filename : InterFaceDemo.java
* Author : huyn
* Creation time : 下午8:47:46 - 2018年12月25日
* Description :
*/
package com.day6.com;
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
//定义接口
interface White{
	//接口内全是抽象方法
	//白方法
	public void white();
	//定义成员变量的话 必须是常量
}

interface Rich{
	public void rich();
}

interface Beautiful{
	public void beautiful();
}

//类实现接口
class WomanStar implements White,Rich{
	public void white(){
		System.out.println("white.....");
	};
	public void rich(){
		System.out.println("rich.....");
	};
}


class TuHao{
	//土豪征婚,要求白
	//White是接口
	public void marry(White w){
		w.white();
	}
}

class KoreanMan implements White{
	//韩国男也很白
	public void white(){
		System.out.println("白面小生");
	}
}