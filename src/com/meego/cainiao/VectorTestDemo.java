/** 
* @author:huyn 
* @version 创建时间：2019年1月16日 下午5:02:04 
* @Des:Vector 是同步的数据结构
*/ 

package com.meego.cainiao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
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
	      
	      //boolean equals(Object o) 
	      //比较指定对象与此向量的相等性。
	      Object v11 = v.clone(); 
	      System.out.println(v.equals(v1));
	      
	      //Object firstElement() 
	      //返回此向量的第一个组件（位于索引 0) 处的项）。
	      System.out.println(v.firstElement());
	      
	      
	      //Object get(int index) 
	      //返回向量中指定位置的元素。
	      System.out.println(v.get(4));
	      
	      //int hashCode() 
	      //返回此向量的哈希码值。
	      System.out.println(v.hashCode());
	      System.out.println(v1.hashCode());
	      System.out.println(v11.hashCode());
	      
	      //int indexOf(Object elem) 
	      //返回此向量中第一次出现的指定元素的索引，如果此向量不包含该元素，则返回 -1。
	      
	      System.out.println(v.indexOf(9999));
	      
	      //int indexOf(Object elem, int index) 
	      //返回此向量中第一次出现的指定元素的索引，从 index 处正向搜索，如果未找到该元素，则返回 -1。
	      v.add(9999);
	      System.out.println(v.indexOf(9999,7));
	      
	      //void insertElementAt(Object obj, int index) 
	      //将指定对象作为此向量中的组件插入到指定的 index 处。
	      v.insertElementAt(9999, 6);
	      System.out.println(v);
	      
	      //boolean isEmpty() 
	      //测试此向量是否不包含组件。
	      Vector<Number> v2 = new Vector<Number>(3,2); ;
	      System.out.println(v.isEmpty() + "--->v2" + v2.isEmpty());
	      
	      
	      //Object lastElement() 
	      //返回此向量的最后一个组件。
	      System.out.println("Object lastElement() 返回此向量的最后一个组件。");
	      System.out.println(v.lastElement());
	      
	      
	      //int lastIndexOf(Object elem) 
	      //返回此向量中最后一次出现的指定元素的索引；如果此向量不包含该元素，则返回 -1。
	      System.out.println("返回此向量中最后一次出现的指定元素的索引；如果此向量不包含该元素，则返回 -1。");
	      System.out.println(v.lastIndexOf(9999));
	      System.out.println(v.lastIndexOf(7777));
	      
	      //	Object remove(int index) 
	      //移除此向量中指定位置的元素。
	      System.out.println("移除此向量中指定位置的元素。");
	      v2.add(1);
	      v2.add(2);
	      v2.add(2);
	      v2.add(4);
	      v2.add(55);
	      v2.add(771);
	      v2.add(9999);
	      v2.add(7777);
	      System.out.println(v2.remove(0));
	      
	      
	      
	      //boolean remove(Object o) 
	      //移除此向量中指定元素的第一个匹配项，如果向量不包含该元素，则元素保持不变。
	      System.out.println("移除此向量中指定元素的第一个匹配项，如果向量不包含该元素，则元素保持不变。");
	      System.out.println(v2);
	      System.out.println(v11);
	      System.out.println(v2.remove(v11));
	      System.out.println(v2);
	      
	      
	      
	      //	boolean removeAll(Collection c) 
	      //从此向量中移除包含在指定 Collection 中的所有元素。
	      System.out.println("从此向量中移除包含在指定 Collection 中的所有元素。");
	      System.out.println(v2.removeAll((Collection<?>) v11));
	      System.out.println((Collection<?>) v11);
	      System.out.println(v2);
	      
	      
	      
	      //	boolean removeElement(Object obj) 
	      //从此向量中移除变量的第一个（索引最小的）匹配项。
	      System.out.println("从此向量中移除变量的第一个（索引最小的）匹配项。");
	      System.out.println(v2.removeAll((Collection<?>) v11));
	      
	      
	      //void removeElementAt(int index) 
	      //删除指定索引处的组件。
	      System.out.println("删除指定索引处的组件。");
	      v2.removeElementAt(2);
	      System.out.println(v2);
	      
	      
	      
	      
	      //	protected void removeRange(int fromIndex, int toIndex)
	      //从此 List 中移除其索引位于 fromIndex（包括）与 toIndex（不包括）之间的所有元素。
	      System.out.println("从此 List 中移除其索引位于 fromIndex（包括）与 toIndex（不包括）之间的所有元素。");
	      System.out.println(v);
	      //v2.removeRange(0,3);
	      System.out.println(v);
	      
	      
	      
	      
	      //boolean retainAll(Collection c) 
	      //在此向量中仅保留包含在指定 Collection 中的元素。
	      System.out.println("在此向量中仅保留包含在指定 Collection 中的元素。");
	      v2.add(1);
	      v2.add(2);
	      v2.add(2);
	      v2.add(4);
	      v2.add(55);
	      v2.add(771);
	      v2.add(9999);
	      v2.add(7777);
	      System.out.println(v2);
	      v2.retainAll((Collection<?>) v11);
	      System.out.println(v2);
	      
	      
	      
	      //Object set(int index, Object element)
	      //用指定的元素替换此向量中指定位置处的元素。返回的是被替换位置的元素
	      System.out.println("用指定的元素替换此向量中指定位置处的元素。");
	      System.out.println(v);
	      System.out.println(v.set(2,777777));
	      System.out.println(v);
	      
	      
	      
	      
	      //void setElementAt(Object obj, int index) 
	      //将此向量指定 index 处的组件设置为指定的对象。
	      System.out.println("将此向量指定 index 处的组件设置为指定的对象。");
	      v.setElementAt(27777, 1);
	      System.out.println(v);
	      
	      
	      
	      
	      
	      //void setSize(int newSize) 
	      //设置此向量的大小。
	      System.out.println("设置此向量的大小。");
	      System.out.println(v.size());
	      v.setSize(23);
	      System.out.println(v.size());
	      System.out.println(v.capacity());
	      
	      
	      
	      
	      
	      //int size() 
	      //返回此向量中的组件数。
	      
	      
	      
	      
	      
	      
	      
	      
	      //List subList(int fromIndex, int toIndex) 
	      //返回此 List 的部分视图，元素范围为从 fromIndex（包括）到 toIndex（不包括）。
	      System.out.println("返回此 List 的部分视图，元素范围为从 fromIndex（包括）到 toIndex（不包括）。");
	      ArrayList<Number> arr1 = new ArrayList<Number>();
//	      arr1 = (ArrayList<Number>) v.subList(0, 4);
//	      System.out.println(arr1);
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      //Object[] toArray()
	      //返回一个数组，包含此向量中以恰当顺序存放的所有元素。
	      System.out.println("返回一个数组，包含此向量中以恰当顺序存放的所有元素。");
	      System.out.println(v);
	      System.out.println(v.toArray());
	      for(Object i : v.toArray()) {
	    	  System.out.println(i);
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      //Object[] toArray(Object[] a) 
	      //返回一个数组，包含此向量中以恰当顺序存放的所有元素；返回数组的运行时类型为指定数组的类型。
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      //String toString() 
	      //返回此向量的字符串表示形式，其中包含每个元素的 String 表示形式。
	      
	      
	      
	      
	      //void trimToSize() 
	      //对此向量的容量进行微调，使其等于向量的当前大小。等同于消除空白
	      System.out.println("void trimToSize() 对此向量的容量进行微调，使其等于向量的当前大小。");
	      System.out.println("v的size大小" + v.size());
	      System.out.println("v的cap容量大小"+ v.capacity());
	      v.trimToSize();
	      System.out.println("v的size大小" + v.size());
	      System.out.println("v的cap容量大小"+ v.capacity());
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}

