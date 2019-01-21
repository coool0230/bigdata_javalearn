/** 
* @author:huyn 
* @version 创建时间：2019年1月18日 上午10:32:02 
* @Des:Properties 继承于 Hashtable.表示一个持久的属性集.属性列表中每个键及其对应值都是一个字符串。
* Properties 类被许多Java类使用。例如，在获取环境变量时它就作为System.getProperties()方法的返回值。
* Properties 定义如下实例变量.这个变量持有一个Properties对象相关的默认属性列表。
*/ 

package com.meego.cainiao;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTestDemo {

	public static void main(String[] args) {
		Properties capitals = new Properties();
	      Set states;
	      String str;
	      
	      capitals.put("Illinois", "Springfield");
	      capitals.put("Missouri", "Jefferson City");
	      capitals.put("Washington", "Olympia");
	      capitals.put("California", "Sacramento");
	      capitals.put("Indiana", "Indianapolis");
	 
	      // Show all states and capitals in hashtable.
	      states = capitals.keySet(); // get set-view of keys
	      Iterator itr = states.iterator();
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println("The capital of " +
	            str + " is " + capitals.getProperty(str) + ".");
	      }
	      System.out.println();
	 
	      // look for state not in list -- specify default
	      str = capitals.getProperty("Florida", "Not Found");
	      System.out.println("The capital of Florida is "
	          + str + ".");
	}

}

