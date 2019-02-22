/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午5:23:58 
* @Des:文件写入
*/ 

package com.meego.cainiao.FileOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {
		try {
			BufferedWriter f = new BufferedWriter(new FileWriter("meego.txt"));
			f.write("I am meego,I'm learning file operation,我正在学习文件操作");
			f.close();
			System.out.println("文件操作成功");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

