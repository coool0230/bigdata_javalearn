/** 
* @author:huyn 
* @version 创建时间：2019年1月18日 上午10:54:13 
* @Des:Collection
*/ 

package com.meego.cainiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionTestDemo {
	/**
	 * 	Collection 接口
	 *Collection 是最基本的集合接口，一个 Collection 代表一组 Object，即 Collection 的元素, 
	 *Java不提供直接继承自Collection的类，只提供继承于的子接口(如List和set)。
	 *Collection 接口存储一组不唯一，无序的对象。
	 * 
	 * List 接口
	 *List接口是一个有序的 Collection，使用此接口能够精确的控制每个元素插入的位置，
	   * 能够通过索引(元素在List中位置，类似于数组的下标)来访问List中的元素，第一个元素的索引为 0，而且允许有相同的元素。
	 *List 接口存储一组不唯一，有序（插入顺序）的对象。
	 * 
	 * Set
	 *Set 具有与 Collection 完全一样的接口，只是行为上不同，Set 不保存重复的元素。
	 *Set 接口存储一组唯一，无序的对象。
	 * 
	 * SortedSet 
	    * 继承于Set保存有序的集合。
	 * 
	 *Map
	 *Map 接口存储一组键值对象，提供key（键）到value（值）的映射。 
	 * 
	 * Map.Entry 
	    *描述在一个Map中的一个元素（键/值对）。是一个Map的内部类。
	 * 
	 * 
	 * 	SortedMap
	    *继承于 Map，使 Key 保持在升序排列。
	 * 
	 * 
	 *Enumeration
	    *这是一个传统的接口和定义的方法，通过它可以枚举（一次获得一个）对象集合中的元素。这个传统接口已被迭代器取代。 

	 */
	public static void main(String[] args) {
		//Set和List的区别
		
		//Set 接口实例存储的是无序的，不重复的数据。List 接口实例存储的是有序的，可以重复的元素。

		//Set检索效率低下，删除和插入效率高，插入和删除不会引起元素位置改变 <实现类有HashSet,TreeSet>。

		//List和数组类似，可以动态增长，根据实际存储的数据的长度自动增长List的长度。查找元素效率高，插入删除效率低，
		//因为会引起其他元素位置改变 <实现类有ArrayList,LinkedList,Vector> 。
		
	     List<String> list=new ArrayList<String>();
	     list.add("Hello");
	     list.add("World");
	     list.add("HAHAHAHA");
	     //第一种遍历方法使用foreach遍历List
	     for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
	        System.out.println(str);
	     }
	 
	     //第二种遍历，把链表变为数组相关的内容进行遍历
	     String[] strArray=new String[list.size()];
	     list.toArray(strArray);
	     for(int i=0;i<strArray.length;i++) //这里也可以改写为  foreach(String str:strArray)这种形式
	     {
	        System.out.println(strArray[i]);
	     }
	     
	    //第三种遍历 使用迭代器进行相关遍历
	     
	     Iterator<String> ite=list.iterator();
	     while(ite.hasNext())//判断下一个元素之后有值
	     {
	         System.out.println(ite.next());
	     }
	     
	     
	     Map<String, String> map = new HashMap<String, String>();
	      map.put("1", "value1");
	      map.put("2", "value2");
	      map.put("3", "value3");
	      
	      //第一种：普遍使用，二次取值
	      System.out.println("通过Map.keySet遍历key和value：");
	      for (String key : map.keySet()) {
	       System.out.println("key= "+ key + " and value= " + map.get(key));
	      }
	      
	      //第二种
	      System.out.println("通过Map.entrySet使用iterator遍历key和value：");
	      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	      while (it.hasNext()) {
	       Map.Entry<String, String> entry = it.next();
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	      
	      //第三种：推荐，尤其是容量大时
	      System.out.println("通过Map.entrySet遍历key和value");
	      for (Map.Entry<String, String> entry : map.entrySet()) {
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	    
	      //第四种
	      System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
	      for (String v : map.values()) {
	       System.out.println("value= " + v);
	      }
	}

}

