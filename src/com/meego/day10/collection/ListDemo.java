/**
* Filename : ListDemo.java
* Author : huyn
* Creation time : 下午9:13:29 - 2019年1月8日
* Description :
*/
package com.meego.day10.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义集合List
		List<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("tom");
		list.add("tomas");
		list.add("tomas");
		list.add("tomasLee");
		//元素个数
		System.out.println(list.size());			//获取列表大小
		
		System.out.println(list.get(list.size() - 1));      			//打印最后一个元素
		
		System.out.println(list.remove(0));					//删除第一个元素
		list.add(1, "刘涛");											//指定位置插入元素
		for(int j =0; j < list.size();j ++){
			System.out.println(list.get(j));
		}
		
//		list.clear(); 													//清空列表
		
		List<String> list2 = null;								//列表不存在
		List<String> list3 = new ArrayList<String>();			//列表为空
		
		System.out.println(list3.isEmpty());
//		System.out.println(list2.isEmpty());				//list2 列表不存在
		
		if(list3 != null && list3.isEmpty()){					//必选先判断是否存在,即是否是null
			System.out.println(list3.size());
			
		}
		//通过迭代器访问集合
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		

	}

}
