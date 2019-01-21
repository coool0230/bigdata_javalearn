/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:45:34 
* @Des:使用 String toUpperCase() 方法将字符串从小写转为大写：
*/ 

package com.meego.cainiao.string;
public class StringToUpperCaseEmp {

	public static void main(String[] args) {
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        //ToUpperCase() 全部转换为大写字母
        System.out.println("原始字符串: " + str);
        System.out.println("转换为大写: " + strUpper);
        //toLowerCase() 转换为小写
        System.out.println("转换为小写: " + strUpper.toLowerCase());
	}

}

