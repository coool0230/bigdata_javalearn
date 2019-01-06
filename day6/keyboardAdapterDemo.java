/**
* Filename : keyboardAdapter.java
* Author : huyn
* Creation time : 下午10:47:13 - 2018年12月26日
* Description :
*/
package com.day6.com;
public class keyboardAdapterDemo {
	public static void main(String[] args){
		Keyboard kb = new Keyboard();
		kb.AddKeyboardListener(new KeyboardAdapter(){
			public void inputA(){
				System.out.println("输入A");
			}
			public void inputB(){
				System.out.println("输入B");
			}
			public void inputTab(){
				System.out.println("输入Tab");
			}
			public void inputEnter(){
				System.out.println("输入Enter");
			}
		});
		kb.receiveA();
		kb.receiveB();
		kb.receiveTab();
		kb.receiveEnter();
	}
}
//键盘
class Keyboard{
	private KeyboardListener kl;
	public void AddKeyboardListener(KeyboardListener kl){
		this.kl = kl;
	}
		public  void receiveA(){
			System.out.println("接收到了A");
			kl.inputA();
		}
		public void receiveB(){
			System.out.println("接收到了B");
			kl.inputB();
		}
		public void receiveTab(){
			System.out.println("接收到了Tab");
			kl.inputTab();
		}
		public void receiveEnter(){
			System.out.println("接收到了Enter");
			kl.inputEnter();
		}
}

//键盘监听器
interface KeyboardListener{
	public void inputA();
	public void inputB();
	public void inputC();
	public void inputD();
	public void inputTab();
	public void inputEnter();
	public void inputEsc();
}

class KeyboardAdapter implements KeyboardListener{
	public void inputA(){}
	public void inputB(){}
	public void inputC(){}
	public void inputD(){}
	public void inputTab(){}
	public void inputEnter(){}
	public void inputEsc(){}
}