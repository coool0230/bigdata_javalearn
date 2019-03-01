/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午11:12:25 
* @Des:使用 Java Util 类的 Arrays.asList(name)方法将数组转换为集合
*/ 

package com.meego.cainiao.set;

import java.util.Arrays;
import java.util.List;

public class ArrayTransferSet {

	public static void main(String[] args) {
		int n = 5;
		String[] name = new String[n];
		for(int i = 0; i < n;i ++) {
			name[i] = String.valueOf(i);
		}
		List<String> list = Arrays.asList(name);
		for(String li : list) {
			System.out.println(li);
		}
		
	}

}

