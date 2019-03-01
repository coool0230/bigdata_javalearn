/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午2:57:16 
* @Des:使用 Collection 类的 collection.remove() 方法来删除集合中的指定的元素
*/ 

package com.meego.cainiao.set;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveSpecialElementInSetDemo {

	public static void main(String[] args) {
		System.out.println( "集合实例!\n" ); 
		int size;
		HashSet hs = new HashSet();
	    String str1 = "Yellow", str2 = "White", str3 = 
	    	      "Green", str4 = "Blue";
	    Iterator iter;
	    hs.add(str1);    
	    hs.add(str2);   
	    hs.add(str3);   
	    hs.add(str4);
	    System.out.print("集合数据: "); 
	    iter = hs.iterator();
	    while (iter.hasNext()){
	          System.out.print(iter.next() + " ");  
	       }
	    System.out.println();
	    hs.remove(str2);
	    System.out.println("删除[" + str2 + " ]之后\n");
	    System.out.print("现在集合的数据是: ");
	    iter = hs.iterator();
	    while (iter.hasNext()){
	          System.out.print(iter.next() + " ");  
	       }
	    System.out.println();
	    size = hs.size();
	    System.out.println("集合大小: " + size + "\n");
	}

}

