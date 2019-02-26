/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午3:38:40 
* @Des:使用do...while结构求0~100的整数数字之和
*/ 

package com.meego.cainiao.datastructure;
public class SumOfNumbers {

	public static void main(String[] args) {
		int limit = 100;
		int i = 0;
		int sum = 0;
		do {
			sum = sum + i;
			i ++;
		}
		while(i <= limit);
		System.out.println("sum = " + sum);
	}

}

