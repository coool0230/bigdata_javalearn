/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:22:45 
* @Des:使用了String 类的 indexOf() 方法在字符串中查找子字符串出现的位置，如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1：
*/ 

package com.meego.cainiao.string;
public class SearchStringEmp {

	public static void main(String[] args) {
	      String strOrig = "Google Runoob Taobao baidu";
	      int intIndex = strOrig.indexOf("Runoob");
	      //等同于lastIndexOf
	      if(intIndex == - 1){
	         System.out.println("没有找到字符串 Runoob");
	      }else{
	         System.out.println("Runoob 字符串位置 " + intIndex);
	      }
	}

}

