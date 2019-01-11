/**
* Filename : NoNameDemo2.java
* Author : huyn
* Creation time : ����8:56:12 - 2018��12��26��
* Description :����������
*/
package com.meego.day6;
public class NoNameDemo2 {
	public static void main(String[] args){
		Pet1 pet = new Dog4(){
			public void meng(){
				run();
				System.out.println("ameng");
			}
			public void run(){					//�����ⲿ����
				System.out.println("��һȦ");
			}
		};
		
		pet.meng();
//		pet.run();							//���ܵ���,��ΪPet��,û�ж���run����;
	}
}

abstract class Pet1{
	abstract public void meng();
}


class Dog4 extends Pet1{
	public void meng(){
		System.out.println("Dog meng");
	}
}