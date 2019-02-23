/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:11:19 
* @Des:使用 File 类的 file.exists() 方法来检测文件是否存在
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;

public class TestFileIsExist {

	public static void main(String[] args) {
        File file = new File("meeeego.txt");
        System.out.println(file.exists());
	}

}

