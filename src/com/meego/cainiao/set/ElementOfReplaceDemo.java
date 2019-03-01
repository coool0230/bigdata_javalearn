/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午5:02:28 
* @Des:使用 Collections 类的 replaceAll() 来替换List中所有的指定元素
*/ 

package com.meego.cainiao.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ElementOfReplaceDemo {

	public static void main(String[] args) {
		List ll = Arrays.asList("one,two,three,four,five,six,seven,eight".split(","));
		System.out.println("List :"+ll);
		Collections.replaceAll(ll, "one", "111");
		System.out.println("List :"+ll);
	}

}

