/**
* Filename : StackHeapDemo.java
* Author : huyn
* Creation time : 下午10:27:33 - 2018年12月22日
* Description :堆溢出 || 栈溢出
*/
package com.day4.com;
public class StackHeapDemo {
	public static void main(String[] args){
//		byte[] arr = new byte[1 * 1024 * 1024 * 1024];  //1024* 1024* 1024  一个G内存的字节数组,数组存在于堆中
		//整数是有范围的
//		byte[] arr1 = new byte[Integer.MAX_VALUE];    //整数最大值,  MIN_VALUE  整数最小值(附属)
		System.out.println("ok");
//		int i = 0;
		while(true){
			out(1);
		}
	}
	public static void out(int i){
		System.out.println(i);
		out(i+ 1);							//递归自己,栈溢出
	}
}
