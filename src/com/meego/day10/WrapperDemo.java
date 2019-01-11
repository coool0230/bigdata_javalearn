/**
* Filename : WrapperDemo.java
* Author : huyn
* Creation time : 下午10:08:35 - 2019年1月7日
* Description :
*/
package com.meego.day10;
public class WrapperDemo {

	/**
	 * @param args
	 */
	//ctrl+shitf+F   格式化代码
	//alt + /    内容辅助
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte b = new Byte((byte)12);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
		Short s  = new Short((short)12);
		Integer i  = new Integer(12);
		
		Long l  = new Long(12);
		Boolean bool = new Boolean(true);
		bool.booleanValue();
		
		long ll = 11L;
		float f  = 12.2f;
		
		Integer.toHexString(100);//转换成16进制
		
		//字符串转换成整数
		Integer i0 = Integer.parseInt("123");

	}

}
