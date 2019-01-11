/**
* Filename : NinexNine.java
* Author : huyn
* Creation time : ����8:51:55 - 2018��12��19��
* Description :��ӡ99�˷���
*/
package com.meego.day2;
public class NinexNine {
	public static void main(String[] args){
		int hang = 1;
//		int lie = 1;
		while(hang <= 9){
			int lie = 1;
			while(lie <= hang){
				System.out.print(hang + "*" + lie + "=" + (hang*lie)+ "\t");
				lie ++;
			}
			System.out.println();
			hang ++;
		}
	}

}
