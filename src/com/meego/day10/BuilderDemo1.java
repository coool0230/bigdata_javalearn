/**
* Filename : BuilderDemo1.java
* Author : huyn
* Creation time : 下午9:57:13 - 2019年1月7日
* Description :
*/
package com.meego.day10;
public class BuilderDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//builder模式.构建器模式
		//方法链编程
		PersonDemoo p = new PersonDemoo()
				.setName("tom")
				.setAge(12).
				setSex(false);

	}

}
