/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午2:52:51 
* @Des:
* Java break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
*/ 

package com.meego.cainiao.method;

import java.util.Arrays;

public class BreakDemo {

	public static void main(String[] args) {
		int[] arr = {11,12,22,23,34,545,657,45,32,16,10,9};
		int num = 545;
		Boolean found = false;
		int i = 0;
		for(;i < arr.length;i ++) {
			if(num == arr[i]) {
				found = true;
				break;
			}
		}
		if(found) {
//			System.out.println("元素在列表中");
			System.out.println("元素在列表中的位置" + i);
		}
		else {
			System.out.println("元素不在列表中");
		}
	}

}

