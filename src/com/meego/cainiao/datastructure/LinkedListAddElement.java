/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:26:16 
* @Des:使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class LinkedListAddElement {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		System.out.println(ll);
		ll.addFirst("0");
		System.out.println(ll);
		ll.addLast("6");
		System.out.println(ll);
	}

}

