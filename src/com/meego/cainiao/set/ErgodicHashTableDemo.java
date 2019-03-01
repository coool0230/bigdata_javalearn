/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午4:27:55 
* @Des:使用 Hashtable 类的 keys() 方法来遍历输出键值
*/ 

package com.meego.cainiao.set;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class ErgodicHashTableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
	    ht.put("3", "Three");
	    Enumeration e = ht.keys();
	    while (e.hasMoreElements()){
	        System.out.println(e.nextElement());
	       }
	    Enumeration ele = ht.elements();
	    while(ele.hasMoreElements()){
	        System.out.println(ele.nextElement());
	      }

	}

}

