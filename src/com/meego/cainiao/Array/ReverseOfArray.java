/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午3:19:39 
* @Des:列表翻转
* 数组没有那么方法()
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOfArray {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("AAA");
		arr.add("BBB");
		arr.add("CCC");
		arr.add("DDD");
		arr.add("EEE");
		arr.add("FFF");
        System.out.println("反转前排序: " + arr);
        Collections.reverse(arr); 
        System.out.println("反转后排序: " + arr);
	}

}

