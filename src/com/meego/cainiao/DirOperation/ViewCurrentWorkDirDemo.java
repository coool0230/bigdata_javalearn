/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午11:57:03 
* @Des:使用 System 的 getProperty() 方法来获取当前的工作目录
*/ 

package com.meego.cainiao.DirOperation;
public class ViewCurrentWorkDirDemo {

	public static void main(String[] args) {
		String curDir = System.getProperty("user.dir");
		System.out.println(curDir);
	}

}

