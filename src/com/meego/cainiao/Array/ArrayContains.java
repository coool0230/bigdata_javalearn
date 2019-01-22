/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午5:39:44 
* @Des:何使用 contains () 方法来确定数组中是否包含指定元素
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;

public class ArrayContains {

	public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        System.out.println("objArray 是否包含字符串common2? ： "
        +objArray.contains("common2"));
        System.out.println("objArray2 是否包含数组 objArray? ："
        +objArray2.contains(objArray) );
	}

}

