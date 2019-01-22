/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午5:26:43 
* @Des:使用 retainAll () 方法来计算两个数组的交集
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;

public class ArrayOfMix {
	/**
	 * 可以使用retainAll方法：oldCourses.retainAll(newCoures)。
	 * 如果存在相同元素，oldCourses中仅保留相同的元素。
	 * 如果不存在相同元素，oldCourse会变为空。
	 */

	public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add("2");
        objArray2.add("2");
        objArray2.add("2");
        objArray2.add("2");
        objArray.add("1");
        objArray.add("3");
        objArray.add("2");
        System.out.println("objArray 数组元素："+objArray);
        System.out.println("objArray2 数组元素："+objArray2);
        objArray2.retainAll(objArray);		//返回的是objArray2中和objArray中相同的元素
        System.out.println("objArray2 & objArray 数组交集为："+objArray2);
	}

}

