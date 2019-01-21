/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:08:31 
* @Des:通过字符串函数 substring() 函数来删除字符串中的一个字符，我们将功能封装在 removeCharAt 函数中。
*/ 

package com.meego.cainiao.string;
public class RemoveOneCharFromString {


	public static void main(String[] args) {
	      String str = "this is Java";
	      System.out.println(removeCharAt(str, 3));
	   }
	   public static String removeCharAt(String s, int pos) {
		  //通过切片  拼接pos前的字符串 + pos后的字符串
	      return s.substring(0, pos) + s.substring(pos + 1);
	}

}

