/**
* Filename : keyboardAdapter.java
* Author : huyn
* Creation time : ����10:47:13 - 2018��12��26��
* Description :
*/
package com.meego.day6;
public class keyboardAdapterDemo {
	public static void main(String[] args){
		Keyboard kb = new Keyboard();
		kb.AddKeyboardListener(new KeyboardAdapter(){
			public void inputA(){
				System.out.println("����A");
			}
			public void inputB(){
				System.out.println("����B");
			}
			public void inputTab(){
				System.out.println("����Tab");
			}
			public void inputEnter(){
				System.out.println("����Enter");
			}
		});
		kb.receiveA();
		kb.receiveB();
		kb.receiveTab();
		kb.receiveEnter();
	}
}
//����
class Keyboard{
	private KeyboardListener kl;
	public void AddKeyboardListener(KeyboardListener kl){
		this.kl = kl;
	}
		public  void receiveA(){
			System.out.println("���յ���A");
			kl.inputA();
		}
		public void receiveB(){
			System.out.println("���յ���B");
			kl.inputB();
		}
		public void receiveTab(){
			System.out.println("���յ���Tab");
			kl.inputTab();
		}
		public void receiveEnter(){
			System.out.println("���յ���Enter");
			kl.inputEnter();
		}
}

//���̼�����
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