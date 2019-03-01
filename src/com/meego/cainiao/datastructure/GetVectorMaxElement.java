/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 上午10:52:02 
* @Des:使用 Vector 类的 v.add() 方法及 Collection 类的 Collections.max() 来获取向量的最大元素：
*/ 

package com.meego.cainiao.datastructure;

import java.util.Collections;
import java.util.Vector;

public class GetVectorMaxElement {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Double("11.222"));
		v.add(new Double("99.9999"));
		v.add(new Double("22.333"));
		v.add(new Double("44.555"));
		v.add(new Double("55.666"));
		Object j = Collections.max(v);
		System.out.println("最大元素为:" + j);
		
		
	}

}

