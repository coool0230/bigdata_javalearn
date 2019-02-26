/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午9:56:37 
* @Des:使用 File 类的 mkdirs() 实现递归创建目录
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class DirRecursion {

	public static void main(String[] args) {
		String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
		File f = new File(directories);
		boolean result = f.mkdirs();
		System.out.println("Status = " + result);
	}

}

