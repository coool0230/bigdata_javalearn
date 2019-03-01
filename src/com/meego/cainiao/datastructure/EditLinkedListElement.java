/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午10:59:46 
* @Des:使用 listname.add() 和 listname.set() 方法来修改链接中的元素
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;

public class EditLinkedListElement {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaa");
		ll.add("eee");
		ll.add("sss");
		ll.add("jjj");
		ll.add("ttt");
		System.out.println(ll);
		ll.set(1, "000");
		System.out.println(ll);
	}

}

