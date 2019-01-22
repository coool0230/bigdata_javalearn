/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午2:10:08 
* @Des:通过 format() 方法来格式化字符串，还可以指定地区来格式化
*/ 

package com.meego.cainiao.string;

import java.util.Locale;

public class StringFormatDemo {

	public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA  , "%-10.4f%n%n", e);  //指定本地为中国（CHINA）
	}

}

