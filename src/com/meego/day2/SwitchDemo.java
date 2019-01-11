/**
* Filename : SwitchDemo.java
* Author : huyn
* Creation time : ����10:21:21 - 2018��12��18��
* Description :��ʾSwitch �÷�
*/
package com.meego.day2;
public class SwitchDemo {
	public static void main(String[] args){
		int a = 10;
		switch(a){
		case 1:
		case 2:
		case 3:
			System.out.println("����");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("�ļ�");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("�＾");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("����");
			break;
		default:
			System.out.println("δ֪�·�");
			break;
		}
	}

}
