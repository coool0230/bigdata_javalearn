/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午4:48:16 
* @Des:使用 Collections 类的 sort() 方法对向量进行排序并使用 binarySearch() 方法来获取向量元素的索引值
*/ 

package com.meego.cainiao.datastructure;

import java.util.Collections;
import java.util.Vector;

public class GetIndexOfVectorElement {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Q");
		v.add("R");
		v.add("A");
		v.add("2");
		v.add("P");
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "2");
		System.out.println(index);
	}

}

