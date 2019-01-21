/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 上午11:21:12 
* @Des:SerializeDemo 例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中。
* 该程序执行后，就创建了一个名为 employee.ser 文件。该程序没有任何输出，但是你可以通过代码研读来理解程序的作用。
* 注意： 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。
*/ 

package com.meego.cainiao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		EmployeeDemo e = new EmployeeDemo();
	    e.name = "Reyan Ali";
	    e.address = "Phokka Kuan, Ambehta Peer";
	    e.SSN = 102;
	    e.number = 101;
	    try{
	       FileOutputStream fileOut =
	       new FileOutputStream("C:/java_workzone/bigdata_javalearn/src/com/meego/cainiao/employeedemo.ser");
	       ObjectOutputStream out = new ObjectOutputStream(fileOut);
	       out.writeObject(e);
	       out.close();
	       fileOut.close();
	       System.out.printf("C:/java_workzone/bigdata_javalearn/src/com/meego/cainiao/employeedemo.ser");
	      }
	    catch(IOException i){
	          i.printStackTrace();
	      }
	}

}

