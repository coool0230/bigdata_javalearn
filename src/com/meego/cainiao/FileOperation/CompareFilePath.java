/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:28:23 
* @Des:使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;

public class CompareFilePath {

	public static void main(String[] args) {
        File file1 = new File("meeeego.txt");
        File file2 = new File("go.txt");
        System.out.println(file1.compareTo(file2));
        if(file1.compareTo(file2) == 0) {
//        	file1.compareTo(file2)			如果文件路径一致返回0,如果不一致返回值不为零
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
	}

}

