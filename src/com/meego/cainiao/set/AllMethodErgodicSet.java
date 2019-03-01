/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午2:11:38 
* @Des:遍历从Collection接口延伸出的List、Set和以键值对形式作存储的Map类型的集合，以下我们分别使用了普通for，增强型的 for ，iterator 等方式来遍历集合
*/ 

package com.meego.cainiao.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AllMethodErgodicSet {

	public static void main(String[] args) {
		AllMethodErgodicSet ames = new AllMethodErgodicSet();
		ames.setTest();
		ames.listTest();
	}
	public void setTest() {
		Set<String> hs = new HashSet<String>();
		for(int i = 0;i < 10;i ++) {
			hs.add("" + i);
		}
		hs.add("java");
		hs.add("go");
		hs.add("java");
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println("Iterator<String> iter = hs.iterator------>  " +  iter.next());
		}
		//Set不允许元素重复。HashSet和TreeSet是两个主要的实现类。
		//Set 只能通过游标来取值，并且值是不能重复的。

		
//		for(int j = 0; j < hs.size();j ++) {
//			System.out.println("for(;;){} " + hs[j] );
//		}
//		list集合不能用for(;;;)进行循环
		
	}
	public void listTest() {
		//list集合有序且允许元素重复。
		//通过listName.get(index) 得到指定位置的元素
		List<String> hl = new ArrayList<String>();
		for(int i = 0; i < 10;i ++) {
			hl.add("" + i);
		}
		hl.add("java");
		hl.add("go");
		hl.add("java");
		 
		Iterator<String> ir = hl.iterator();
		while(ir.hasNext()) {
			System.out.println("iterator :" + ir.next());
		}
		
		for(String s : hl) {
			System.out.println("for(:){}" + s);
		}
		
		for(int k = 0;k < hl.size();k ++) {
			System.out.println("for(;;){}" + hl.get(k));
		}

	}

}

