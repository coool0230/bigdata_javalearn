/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午10:17:44 
* @Des:使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class DirFileIsHiddenDemo {

	public static void main(String[] args) {
		File f = new File("meego1.txt");
		boolean bool = f.isHidden();
		if(bool) {
			System.out.println("文件已隐藏");
		}
		else {
			System.out.println("文件未隐藏");
		}
	}

}

