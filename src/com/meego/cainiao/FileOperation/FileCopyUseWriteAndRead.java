/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 上午11:13:17 
* @Des:使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件
*/ 

package com.meego.cainiao.FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUseWriteAndRead {

	public static void main(String[] args) {
		try {
			BufferedWriter f = new BufferedWriter(new FileWriter("meegoCopy.txt"));
			BufferedReader fc = new BufferedReader(new FileReader("meego.txt"));
			String str;
			while((str =fc.readLine()) != null) {
				f.write(str);
			}
			f.close();
			fc.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

