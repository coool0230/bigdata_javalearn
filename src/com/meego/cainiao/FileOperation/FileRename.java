/** 
* @author:huyn 
* @version 创建时间：2019年2月23日 下午2:07:11 
* @Des:使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
        File oldName = new File("meego.txt");
        File newName = new File("meeeego.txt");
//        File newName = "meegoo.txt";
        if(oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}

