/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午4:23:56 
* @Des:使用 Collections 类的 max() 和 min() 方法来获取List中最大最小值
*/ 

package com.meego.cainiao.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetListMaxAndMinElementDemo {

	public static void main(String[] args) {
//		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		List list = Arrays.asList("a b c d e f g A B G".split(" "));
		System.out.println("list中最大的元素是" + Collections.max(list));
		System.out.println("list中最小的元素是" + Collections.min(list));

	}

}

