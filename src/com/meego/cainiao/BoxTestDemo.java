/** 
* @author:huyn 
* @version 创建时间：2019年1月18日 下午3:15:22 
* @Des:
*/ 

package com.meego.cainiao;
public class BoxTestDemo<T> {
	  private T t;
	  
	  public void add(T t) {
	    this.t = t;
	  }
	 
	  public T get() {
	    return t;
	  }
	 
	  public static void main(String[] args) {
		BoxTestDemo<Integer> integerBox = new BoxTestDemo<Integer>();
		BoxTestDemo<String> stringBox = new BoxTestDemo<String>();
	 
	    integerBox.add(new Integer(10));
	    stringBox.add(new String("菜鸟教程"));
	 
	    System.out.printf("整型值为 :%d\n\n", integerBox.get());
	    System.out.printf("字符串为 :%s\n", stringBox.get());
	  }
}

