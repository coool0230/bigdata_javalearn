/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:20:20 
* @Des:如何使用 Java 的反转函数 reverse() 将字符串反转：
*/ 

package com.meego.cainiao.string;
public class StringReverseExample {

	public static void main(String[] args) {
	      String string="runoob";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("字符串反转前:"+string);
	      System.out.println("字符串反转后:"+reverse);
	}

}

