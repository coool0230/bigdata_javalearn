/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午2:46:36 
* @Des:使用 Collection 和 Listiterator 类的 listIterator() 和 collection.reverse() 方法来反转集合中的元素
*/ 

package com.meego.cainiao.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseSetDemo {

	public static void main(String[] args) {
	      String[] coins = { "A", "B", "C", "D", "E" };
	      List lll = new ArrayList();
	      for (int i = 0; i < coins.length; i++) {
	    	  lll.add(coins[i]);
	      }
	      for(int k = 0; k < lll.size();k ++) {
	    	  System.out.println(lll.get(k));
	      }
	      Iterator<String>  liter = lll.iterator();
	      System.out.println("反转前");
	      while (liter.hasNext()) {
	    	  System.out.println(liter.next());
	      }
	      Collections.reverse(lll);
//	      liter = l.listIterator();
	      System.out.println("反转后");
	      while (liter.hasNext()) {
	    	  System.out.println(liter.next());
	      }
	      for(int k = 0; k < lll.size();k ++) {
	    	  System.out.println(lll.get(k));
	      }
	      
	      for(Object sss : lll) {
	    	  System.out.println(sss);
	      }
	      

	         
	          
	}

}

