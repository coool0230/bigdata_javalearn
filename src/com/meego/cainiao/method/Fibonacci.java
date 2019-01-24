/** 
* @author:huyn 
* @version 创建时间：2019年1月23日 下午12:00:22 
* @Des:斐波那契数列
*/ 

package com.meego.cainiao.method;
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(8));
	}
	
	public static int fib(int n) {
		int num ;
		if(n == 1) {
			num = 0;
			return num;
			
		}
		else if(n == 2) {
			num = 1;
			return num;
		}
		else {
			num = fib(n-1) + fib(n-2);
			return num;
		}
	}
}

