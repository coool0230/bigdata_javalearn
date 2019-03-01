/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午11:47:33 
* @Des:使用 Collection 类的 iterator() 方法来遍历集合
*/ 

package com.meego.cainiao.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ErgodicSetDemo {

	public static void main(String[] args) {
		HashMap<String,String> hmap = new HashMap<String,String>();
		hmap.put("1", "1st");
		hmap.put("2", "2nd");
		hmap.put("3", "3rd");
		Collection cl = hmap.keySet();
		Iterator itr = cl.iterator();
	      while (itr.hasNext()) {
	          System.out.println(itr.next());
	      }
	}

}

