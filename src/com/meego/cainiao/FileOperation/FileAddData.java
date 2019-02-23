/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 上午11:19:08 
* @Des:
*/ 

package com.meego.cainiao.FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAddData {

	public static void main(String[] args) {
		try {
			BufferedWriter f = new BufferedWriter(new FileWriter(("meego.txt"),true));
			f.write('\n');
			f.write("This is add Data");
			f.close();
			BufferedReader fr = new BufferedReader(new FileReader("meego.txt"));
			String str;
			while((str = fr.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

