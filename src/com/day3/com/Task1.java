/**
* Filename : Task1.java
* Author : huyn
* Creation time : 下午3:51:30 - 2018年12月22日
* Description :将一个字节byte转换成0~255之间的整数(正数)\
		将符号位视为数字位,而不是符号位
		
		
*/
package com.day3.com;
public class Task1 {
	public static void main(String[] args){
	int a = -23;
	if(a <= 0){
		a = 128 -a;
		System.out.println(a);
		
		
		}
	}
}
