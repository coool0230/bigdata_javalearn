/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午4:16:48 
* @Des:使用 Collections 类的 rotate() 来循环移动元素，方法第二个参数指定了移动的起始位置
*/ 

package com.meego.cainiao.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateElementDemo {

	public static void main(String[] args) {
		List ll = Arrays.asList("aaa,bbb,ccc,ddd,eee,fff,ggg".split(","));
		System.out.println(ll);
		Collections.rotate(ll, 4);
		//向前移动四个单位
		System.out.println(ll);
	}

}

