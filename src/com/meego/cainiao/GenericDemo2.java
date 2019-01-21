/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 上午10:42:00 
* @Des:类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
* @Des:类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如Objec类型的实例。
*/ 

package com.meego.cainiao;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo2 {

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
		
		
		getUperNumber(age);
//		getUperNumber(name);
		
		
		
	}
	
	public static void getData(List<?> data) {
		System.out.println(data.get(0));
	}
	public static void getUperNumber(List<? extends Number> data) {
		System.out.println("data :" + data.get(0));
	}
}

