/**
* Filename : ExceptionDemo1.java
* Author : huyn
* Creation time : 下午8:15:10 - 2018年12月27日
* Description :
*/
package com.day7.com;
public class ExceptionDemo1 {
	public static void main(String[] args){
		int[] arr = {1};
//		System.out.println(arr[1]);			//越界异常
//		Exception e1 = new Exception();
//		Exception e2 = new Exception("出错了");
		//打印异常消息
//		System.out.println(e2.getMessage());
		//打印栈跟踪信息
//		e2.printStackTrace();
//		System.out.println(1/0);
		//抛出异常
		 test();
	}
	
	public static void test(){
		//通过try catch语句处理异常
		try{
			throw new Exception("出错了!!!!!!!!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("搞定了");
		}
	}
}
