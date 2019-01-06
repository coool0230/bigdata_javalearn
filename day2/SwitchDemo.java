/**
* Filename : SwitchDemo.java
* Author : huyn
* Creation time : 下午10:21:21 - 2018年12月18日
* Description :演示Switch 用法
*/
package com.day2.com;
public class SwitchDemo {
	public static void main(String[] args){
		int a = 10;
		switch(a){
		case 1:
		case 2:
		case 3:
			System.out.println("春季");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("夏季");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("秋季");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬季");
			break;
		default:
			System.out.println("未知月份");
			break;
		}
	}

}
