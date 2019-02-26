/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:33:26 
* @Des:使用 clear() 方法来删除链表中的元素
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class DeleteLinkedListElement {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}

}

