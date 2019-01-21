/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 上午9:43:31 
* @Des:类型通配符一般是使用?代替具体的类型参数。例如 List<?> 
* 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类
*/ 

package com.meego.cainiao;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		List<Number> nums = new ArrayList<Number>();
		
		name.add("tom");
		age.add(18);
		nums.add(300);
		getData(name);
		getData(age);
		getData(nums);
		
		
		
	}
	
	public static void getData(List<?> data) {
		System.out.println(data.get(0));
	}

}

