/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午11:52:24 
* @Des:使用 File 类的 listRoots() 方法来输出系统所有根目录
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class ViewSysRootDir {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("系统所有根目录：");
        for (int i=0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
	}

}

