/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:30:16 
* @Des:使用 LinkedList 类的 linkedlistname.getFirst() 和 linkedlistname.getLast() 来获取链表的第一个和最后一个元素
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class GetLinkedListFirstElement {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	}

}

