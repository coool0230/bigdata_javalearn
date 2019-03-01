/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午10:44:53 
* @Des:队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。
* LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUseMethodDemo {

	public static void main(String[] args) {
		Queue<String> qe = new LinkedList<String>();
		qe.offer("aaa");
		qe.offer("ddd");
		qe.offer("eee");
		qe.offer("sss");
		qe.offer("ttt");
		qe.offer("lll");
		for(String q : qe) {
			System.out.println(q);
		}
		System.out.println("=====================================");
		
		System.out.println("返回第一个元素,并在队列中删除, poll = " + qe.poll());
		for(String q : qe) {
			System.out.println(q);
		}
		System.out.println("=====================================");
		System.out.println("返回第一个元素,element = " + qe.element());
		for(String q : qe) {
			System.out.println(q);
		}
		System.out.println("=====================================");
		
		System.out.println("返回第一个元素,peek = " + qe.peek());
		for(String q : qe) {
			System.out.println(q);
		}
		System.out.println("=====================================");
		
	}

}

