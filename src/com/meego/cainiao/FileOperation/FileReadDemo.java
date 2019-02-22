/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午5:29:50 
* @Des:
*/ 

package com.meego.cainiao.FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("meego.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        }
    }
}

