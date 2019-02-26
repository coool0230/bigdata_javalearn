/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午11:32:15 
* @Des:
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileInSpecilDirDemo {

	public static void main(String[] args) {
		File dir = new File("D:\\");
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("t");
			}
		}; 
		String[] children  =  dir.list(filter);
	    if (children == null) {
	        System.out.println("目录不存在或它不是一个目录");
	       } 
	    else {
	         for (int i=0; i < children.length; i++) {
	             String filename = children[i];
	             System.out.println(filename);
	    }
	}
	}

}

