/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 上午11:38:37 
* @Des:使用 File 类的 createTempFile(String prefix, String suffix)  
* 	方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀：
*/ 

package com.meego.cainiao.FileOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOftemporary {

	public static void main(String[] args) throws IOException {
        File temp = File.createTempFile("testrunoobtmp", ".txt");
        System.out.println("文件路径: "+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();
    }

}

