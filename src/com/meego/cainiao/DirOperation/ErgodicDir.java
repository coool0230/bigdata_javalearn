/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午11:59:47 
* @Des:使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class ErgodicDir {

	public static void main(String[] args) {
		System.out.println("遍历目录");
		File dir = new File("C:\\java_workzone\\bigdata_javalearn");
		ergodicAllDir(dir);
	}
	public static void ergodicAllDir(File dir) {
		System.out.println(dir);
		if(dir.isDirectory()) {
			String[] children = dir.list();
			for(int i = 0;i < children.length;i ++) {
				ergodicAllDir(new File(dir, children[i]));
			}
		}
	}

}

