/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午10:40:15 
* @Des:使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class OutDirOfStructure {
	public static void main(String[] args) {
		dirShow(1,new File("C:\\java_workzone\\bigdata_javalearn"));
	}
	static void dirShow(int indent, File file) {
		for(int i = 0;i < indent;i ++) {
			System.out.print("-");
			
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int k = 0;k < files.length;k ++) {
				dirShow(indent + 4,files[k]);
			}
		}
	}
}

