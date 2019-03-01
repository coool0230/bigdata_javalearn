/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午10:11:09 
* @Des:使用 linkedlistname.indexof(element) 和 linkedlistname.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class LinkedListElementLookUp {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("rrr");
		ll.add("eee");
		ll.add("ddd");
		ll.add("aaa");
		System.out.println(ll);
		System.out.println(ll.indexOf("rrr"));
		System.out.println(ll.lastIndexOf("aaa"));
	}

}

