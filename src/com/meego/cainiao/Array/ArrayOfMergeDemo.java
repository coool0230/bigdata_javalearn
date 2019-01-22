/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午4:00:33 
* @Des:通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfMergeDemo {

	public static void main(String[] args) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));	//将数组a转换成列表
        list.addAll(Arrays.asList(b));					//列表的addAll方法直接增加
        Object[] c = list.toArray();					//toArray()  将列表转换成数组
        System.out.println(Arrays.toString(c));			//将数组c转换成字符串
	}

}

