/** 
* @author:huyn 
* @version 创建时间：2019年1月16日 下午5:02:04 
* @Des:Vector 是同步的数据结构
*/ 

package com.meego.cainiao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class VectorTestDemo {

	private static final int Enumeration = 0;

	public static void main(String[] args) {
		Vector<Number> v = new Vector<Number>(3,2);
	    System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " +
	      v.capacity());
	      v.addElement(new Integer(1));
	      v.addElement(new Integer(2));
	      v.addElement(new Integer(3));
	      v.addElement(new Integer(4));
	      System.out.println("Capacity after four additions: " + v.capacity());

	      v.addElement(new Double(5.45));
	      System.out.println("Current capacity: " + v.capacity());
	      v.addElement(new Double(6.08));
	      v.addElement(new Integer(7));
	      System.out.println("Current capacity: " + v.capacity());
	      v.addElement(new Float(9.4));
	      v.addElement(new Integer(10));
	      System.out.println("Current capacity: " + v.capacity());
	      v.addElement(new Integer(11));
	      v.addElement(new Integer(12));
	      System.out.println("First element: " + (Integer)v.firstElement());
	      System.out.println("Last element: " +  (Integer)v.lastElement());
	      if(v.contains(new Integer(3))) {
	    	  System.out.println("Vector contains 3.");
	      }
	         
	      // enumerate the elements in the vector.
	      Enumeration<Number> vEnum = v.elements();
	      System.out.println("\nElements in vector:");
	      while(vEnum.hasMoreElements()) {
	    	  System.out.println(vEnum.nextElement() + " ");
	      }
	      
	      //void add(int index, Object element) 
	      //在此向量的指定位置插入指定的元素。
	      v.add(6, 9999);
	      System.out.println(v);
	      //boolean add(Object o) 
	      //将指定元素添加到此向量的末尾。
	      System.out.println(v.add(6666) + " " + v);
	      
	      //boolean addAll(Collection c) 
	      //将指定 Collection 中的所有元素添加到此向量的末尾，按照指定 collection 的迭代器所返回的顺序添加这些元素。
	      //Collection<? extends Number> aa = new Collection<Number>();
	      
	      
	      //void addElement(Object obj) 
	      //将指定的组件添加到此向量的末尾，将其大小增加 1。
	      v.addElement(new Integer(666));
	      System.out.println(v);
	      v.addElement(777);
	      System.out.println(v);
	      
	      Object v1 = v.clone();
	      System.out.println(v1);
	      //从此向量中移除所有元素。
	      ((Vector<Number>) v1).clear();
	      System.out.println(v1);
	      
	      //boolean contains(Object elem) 
	      //如果此向量包含指定的元素，则返回 true。
	      
	      System.out.println(v.contains(666));
	      System.out.println(v.size());
	      
	      //void copyInto(Object[] anArray) 
	      //将此向量的组件复制到指定的数组中。
	      Object[] arr = new Object[15];
	      v.copyInto(arr);
	      for(Object i : arr) {
	    	  System.out.println(i);
	      }
	      System.out.println("--------------------------------------------");
	      
	      //Object elementAt(int index) 
	      //返回指定索引处的组件。
	      
	      System.out.println(v.elementAt(6));
	      
	      //Enumeration elements() 
	      //返回此向量的组件的枚举。
	      System.out.println(v.elements());//内存位置?
	      Enumeration<Number> vEnum1 = v.elements();
	      while(vEnum.hasMoreElements()){
	    	  System.out.println(vEnum.nextElement() + " ");
	      }													//???????????????????????
	      
	      
	      //void ensureCapacity(int minCapacity) 
	      //增加此向量的容量（如有必要），以确保其至少能够保存最小容量参数指定的组件数。
	      v.ensureCapacity(50);
	      System.out.println(v.capacity());
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}

