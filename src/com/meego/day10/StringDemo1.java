/**
* Filename : StringDemo1.java
* Author : huyn
* Creation time : 下午7:36:48 - 2019年1月7日
* Description :
*/
package com.meego.day10;
public class StringDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aadasdfasfd";
		System.out.println(substring(str,3,5));
		}
	public static String  substring(String str, int beginIndex, int length){
		return str.substring(beginIndex, beginIndex +length);

	}

}
