/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午5:41:05 
* @Des:使用 delete() 方法将文件删除：
*/ 

package com.meego.cainiao.FileOperation;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
        try{
            File file = new File("c:\\test.txt");
            //new File("**.txt") 只是创建了一个映射，并不能创建一个文件；要用filewriter 在硬盘上写入才能创建一个文件；
            if(file.delete()){
                System.out.println(file.getName() + " 文件已被删除！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

