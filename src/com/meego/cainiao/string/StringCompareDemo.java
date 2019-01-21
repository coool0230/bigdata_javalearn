/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午4:48:53 
* @Des:通过字符串函数 compareTo (string) ，compareToIgnoreCase(String) 及 compareTo(object string) 
* @Des:来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
*/ 

package com.meego.cainiao.string;
public class StringCompareDemo {
	/**
	 * compareTo() 方法的实现思路：
	 * 两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；
	 * 如果两个字符数组的长度不一样，并且较短的数组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差。
	 */

	public static void main(String[] args) {
		String str = "Hello World";
	    String anotherString = "hello world";
	    Object objStr = str;
	 
	    System.out.println( str.compareTo(anotherString) );
	    System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
	    System.out.println( str.compareTo(objStr.toString()));
	}

}

