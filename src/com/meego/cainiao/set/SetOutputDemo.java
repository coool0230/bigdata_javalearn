/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午3:53:11 
* @Des:使用 Java Util 类的 tMap.keySet(),tMap.values() 和 tMap.firstKey() 方法将集合元素输出
*/ 

package com.meego.cainiao.set;

import java.util.TreeMap;

public class SetOutputDemo {

	public static void main(String[] args) {
		System.out.println("TreeMap 实例！\n");
		TreeMap tMap = new TreeMap();
	    tMap.put(7, "Sunday");
	    tMap.put(1, "Monday");
	    tMap.put(2, "Tuesday");
	    tMap.put(3, "Wednesday");
	    tMap.put(4, "Thursday");
	    tMap.put(5, "Friday");
	    tMap.put(6, "Saturday");
	    System.out.println("tMap的键为:" + tMap.keySet());
	    System.out.println("tMap的值为:" + tMap.values());
	    System.out.println("tMap的第5个键为:" + tMap.get(5));
	    System.out.println("tMap的第一个键为:" + tMap.firstKey()+ "值为:" + tMap.get(tMap.firstKey()) + "\n");
	    System.out.println("tMap的第一个键为:" + tMap.lastKey()+ "值为:" + tMap.get(tMap.lastKey()) + "\n");
	    System.out.println("tMap移除第一个键" + tMap.remove(tMap.firstKey()));
	    System.out.println("tMap的值为:" + tMap.values());
	    System.out.println("tMap移除第一个键" + tMap.remove(tMap.lastKey()));
	    System.out.println("tMap的值为:" + tMap.values());
	}

}

