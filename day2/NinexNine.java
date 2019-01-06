/**
* Filename : NinexNine.java
* Author : huyn
* Creation time : 下午8:51:55 - 2018年12月19日
* Description :打印99乘法表
*/
package com.day2.com;
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
