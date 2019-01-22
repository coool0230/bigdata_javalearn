/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午5:18:35 
* @Des:使用 removeAll () 方法来计算两个数组的差集
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;

public class DifferenceOfArray {

	public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add("1");
        objArray2.add("2");
        objArray2.add("3");
        objArray2.add("4");
        objArray.add("1");
        objArray.add(1,"2");
        objArray.add(2,"3");
        System.out.println("objArray 的元素" +objArray);
        System.out.println("objArray2 的元素" +objArray2);
        objArray.removeAll(objArray2);		//a.removeAll(b)  返回的是a-b    减除a中所有在b中存在的元素
        System.out.println("objArray 与 objArray2 数组差集为："+objArray);
	}

}

