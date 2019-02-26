/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:53:08 
* @Des:通过创建用于插入元素的自定义函数 push() 方法和用于弹出元素的 pop() 方法来实现栈：
*/ 

package com.meego.cainiao.datastructure;

import java.util.LinkedList;
	

public class StackOfAchieveDemo {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	public StackOfAchieveDemo(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	public void push(long j) {
		stackArray[++top] = j;
		   }
	public long pop() {
	      return stackArray[top--];
	   }
	public long peek() {
	      return stackArray[top];
	   }
	public boolean isEmpty() {
	      return (top == -1);
	   }
	public boolean isFull() {
	      return (top == maxSize - 1);
	   }

	public static void main(String[] args) {
		StackOfAchieveDemo soad = new StackOfAchieveDemo(10);
		soad.push(10);
		soad.push(20);
		soad.push(30);
		soad.push(40);
		soad.push(50);
		while(!soad.isEmpty()) {
	         long value = soad.pop();
	         System.out.print(value);
	         System.out.print(" ");
		}
		System.out.println("");
	}

}

