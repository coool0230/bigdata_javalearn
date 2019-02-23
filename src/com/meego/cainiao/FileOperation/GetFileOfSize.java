/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 上午11:47:45 
* @Des:使用 File 类的 file.exists() 和 file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;

public class GetFileOfSize {
    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
        	//   ||是或运算符
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }

	public static void main(String[] args) {
        long size = getFileSize("C:");
        System.out.println("meego.txt文件大小为: " + size);
    }

}

