/**
* Filename : GetSwitch1.java
* Author : huyn
* Creation time : 下午2:50:32 - 2018年5月20日
* Description :
*/
package com.chapterfour.com;
public class GetSwitch1 {
	public static void main(String[] args){
		String str = "明日科技";
		switch(str){
		case "明日":
		System.out.println("明日图书网www.mingribook.com");
		break;
		case "明日科技":
		System.out.println("吉林省明日科技有限公司");
		break;
		default:
		System.out.println("front all not");
		}
	}


}
