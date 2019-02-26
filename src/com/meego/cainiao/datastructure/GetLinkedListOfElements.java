/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:35:36 
* @Des:使用 top() 和 pop() 方法来获取链表的元素
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class GetLinkedListOfElements {
	private LinkedList list = new LinkedList();
	public void push(Object v) {
		list.addFirst(v);
	}
	public Object top() {
		return list.getFirst();
	}
	public Object pop() {
		return list.removeLast();
	}
	public static void main(String[] args) {
		GetLinkedListOfElements glloe = new GetLinkedListOfElements();
		for(int i = 0;i < 30;i ++) {
			glloe.push(new Integer(i));
		}
		System.out.println(glloe.list);
		System.out.println(glloe.top());
		System.out.println(glloe.pop());
		System.out.println(glloe.pop());
		System.out.println(glloe.pop());
	}


}

