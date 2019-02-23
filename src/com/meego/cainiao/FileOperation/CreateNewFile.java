/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:21:56 
* @Des:使用 File 类的 File() 构造函数和 file.createNewFile() 方法来创建一个新的文件
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File f  = new File("meego1.txt");
		if(f.createNewFile()) {
//			f.createNewFile() 方法返回true或false
			System.out.println("文件创建成功");
		}
		else {
			System.out.println("文件创建失败");
		}
	}

}

