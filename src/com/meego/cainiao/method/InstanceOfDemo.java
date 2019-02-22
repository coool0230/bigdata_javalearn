/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午2:49:52 
* @Des:
* instanceof 是 Java 的一个二元操作符，类似于 ==，>，< 等操作符。
* instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
*/ 

package com.meego.cainiao.method;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceOfDemo {

	public static void main(String[] args) {
		   Object testObject = new ArrayList();
		      displayObjectClass(testObject);
		   }
		   public static void displayObjectClass(Object o) {
		      if (o instanceof Vector)
		      System.out.println("对象是 java.util.Vector 类的实例");
		      else if (o instanceof ArrayList)
		      System.out.println("对象是 java.util.ArrayList 类的实例");
		      else
		      System.out.println("对象是 " + o.getClass() + " 类的实例");
		   }
}

