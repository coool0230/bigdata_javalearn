/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:04:51 
* @Des:通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置：
*/ 

package com.meego.cainiao.string;
public class SearchlastString {

	public static void main(String[] args) {
	      String strOrig = "Hello world ,Hello Runoob,1231231234142";
	      int lastIndex = strOrig.lastIndexOf("Runoob");
	      //lastIndexOf(Str)  返回Str在字符串中出现的最后的位置
	      if(lastIndex == - 1){
	         System.out.println("没有找到字符串 Runoob");
	      }else{
	         System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
	      }
	}

}

