/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:16:21 
* @Des:使用 File 类的 file.lastModified() 方法来获取文件最后的修改时间
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;
import java.util.Date;

public class GetFileModifyTime {

	public static void main(String[] args) {
        File file = new File("FileRename.java");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
	}

}

