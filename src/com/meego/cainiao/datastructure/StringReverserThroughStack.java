/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午10:14:25 
* @Des:使用用户自定义的方法 StringReverserThroughStack() 来实现字符串反转
*/ 

package com.meego.cainiao.datastructure;

public class StringReverserThroughStack {
	private String input;
	private String output;
	public StringReverserThroughStack(String in) {
		input = in;
	}
	public String doRev() {
		int stackSize = input.length();
		Stack theStack = new Stack(stackSize);
		for(int i = 0;i < stackSize;i ++) {
			char ch = input.charAt(i);
			theStack.push(ch); 
		}
		output = "";
		while (!theStack.isEmpty()) {
	         char ch = theStack.pop(); 
	         output = output + ch; 
	      }
		return output;
		
	}

	public static void main(String[] args) {
		String input = "www.meego.com";
		String output;
		StringReverserThroughStack srts = new StringReverserThroughStack(input);
		output = srts.doRev();
		System.out.println(output);
	}

}


class Stack{
	private int maxSize;
	private char[] stackArray;
	private int top;
	public Stack(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char j) {
		stackArray[++top] = j;
	}
	public char pop(){
		return stackArray[top--];
	}
	public char peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}

