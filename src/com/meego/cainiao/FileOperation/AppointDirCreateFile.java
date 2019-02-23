/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:13:54 
* @Des:使用 File 类的 file.createTempFile() 方法在指定目录中创建文件
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;
import java.io.IOException;

public class AppointDirCreateFile {

	public static void main(String[] args) throws IOException {
        File file = null;
        File dir = new File("C:/");
        file = File.createTempFile
        ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
	}

}

