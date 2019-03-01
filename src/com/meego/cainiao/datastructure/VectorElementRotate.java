/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午11:04:59 
* @Des:使用 swap() 函数来旋转向量
*/ 

package com.meego.cainiao.datastructure;

import java.util.Collections;
import java.util.Vector;

public class VectorElementRotate {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("000");
		v.add("111");
		v.add("222");
		v.add("333");
		v.add("444");
		v.add("555");
		v.add("666");
		v.add("777");
		System.out.println(v);
		Collections.swap(v, 0, 1);
		System.out.println(v);
	}

}

