/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 上午11:43:22 
* @Des:使用 File 类的 fileToChange.lastModified() 和 
* fileToChange setLastModified() 方法来修改文件最后的修改日期
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class EditFileModifyTime {

	public static void main(String[] args) throws IOException {
        File fileToChange = new File("C:/myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}

