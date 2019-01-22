/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午5:14:50 
* @Des:使用 remove () 方法来删除数组元素
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;

public class DelArrayOfElement {

	public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();			//ArrayList 是列表不是数组
        
        objArray.clear();			//清空列表
        objArray.add(0,"1");
        objArray.add(1,"0");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove("1");			//参数可填写 元素值
        objArray.remove(0);				//参数也可以填写索引值(下标)
        System.out.println("数组删除元素后："+objArray);		//当前
	}

}

