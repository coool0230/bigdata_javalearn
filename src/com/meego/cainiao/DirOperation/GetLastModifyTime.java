/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午10:36:37 
* @Des:使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;
import java.util.Date;

public class GetLastModifyTime {

	public static void main(String[] args) {
		File file = new File("D:\\\\\\\\a\\\\\\\\b\\\\\\\\c\\\\\\\\d\\\\\\\\e\\\\\\\\f\\\\\\\\g\\\\\\\\h\\\\\\\\i\\\\\\\\ttt.txt");
		long strTime = file.lastModified();
		System.out.println("最后一次修改时间为:" + new Date(strTime));
	}

}

