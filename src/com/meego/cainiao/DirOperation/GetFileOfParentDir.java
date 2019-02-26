/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午10:32:05 
* @Des:使用 File 类的 file.getParent() 方法来获取文件的上级目录
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class GetFileOfParentDir {

	public static void main(String[] args) {
        File file = new File("D:\\\\a\\\\b\\\\c\\\\d\\\\e\\\\f\\\\g\\\\h\\\\i\\\\ttt.txt");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为 : " + strParentDirectory);
	}

}

