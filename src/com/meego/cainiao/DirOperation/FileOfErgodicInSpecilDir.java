/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午11:23:22 
* @Des:使用 File 类的 list 方法来输出指定目录下的所有文件
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class FileOfErgodicInSpecilDir {

	public static void main(String[] args) {
        File dir = new File("D:");
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "目录不存在或它不是一个目录");
        }
        else {
            for (int i=0; i< children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
	}

}

