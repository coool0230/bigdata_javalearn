/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午4:06:32 
* @Des:使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
*/ 

package com.meego.cainiao.set;

import java.util.ArrayList;
import java.util.List;

public class SetToArrayDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	    list.add("菜"); 
	    list.add("鸟"); 
	    list.add("教");
	    list.add("程");
	    list.add("www.runoob.com");
	    String[] s1 = list.toArray(new String[0]);
	    //如果参数小于列表的长度,自动扩充到参数的长度
	    //如果参数大于列表的长度,用null填充
	    System.out.println(s1.length);
	    for(int i = 0; i < s1.length; ++i){
//	          String contents = s1[i];
	          System.out.print(s1[i] + ",");
	      }
	}

}

