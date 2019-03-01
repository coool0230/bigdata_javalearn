/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午5:07:25 
* @Des:使用 Collections 类的 indexOfSubList() 和 lastIndexOfSubList() 方法来查看子列表是否在列表中，并查看子列表在列表中所在的位置
*/ 

package com.meego.cainiao.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpliceOfListDemo {

	public static void main(String[] args) {
		List ll = Arrays.asList("one,two,three,Four,five,six,seven,eight,three,Four,one,two,three,four".split(","));
		System.out.println("List :"+ll);
		List sublist = Arrays.asList("three,Four".split(","));
		System.out.println("子列表 :"+sublist);
		System.out.println("indexOfSubList:" + Collections.indexOfSubList(ll, sublist));
		System.out.println("indexOfSubList:" + Collections.lastIndexOfSubList(ll, sublist));
	}

}

