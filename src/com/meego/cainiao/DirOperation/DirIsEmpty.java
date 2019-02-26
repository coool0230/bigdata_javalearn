/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 上午10:11:28 
* @Des:使用 File 类的 file.isDirectory() 和 file.list() 方法来判断目录是否为空
*/ 

package com.meego.cainiao.DirOperation;

import java.io.File;

public class DirIsEmpty {

	public static void main(String[] args) {
		File file = new File("./testdir");
		if(file.isDirectory()){
			//判断是否是一个文件夹目录
            if(file.list().length>0){
                System.out.println("目录不为空!");
            }else{
                System.out.println("目录为空!");
            }
        }else{
            System.out.println("这不是一个目录!");
        }
	}

}

