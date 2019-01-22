/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午5:46:01 
* @Des:使用set 集合 来计算两个数组的并集
*/ 

package com.meego.cainiao.Array;

import java.util.HashSet;
//import java.util.Set;

public class ArrayOfUnion {

	public static void main(String[] args) {
        String[] arr1 = { "1", "2", "3" ,"4"};
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");
 
        for (String str : result_union) {
            System.out.println(str);
        }
    }
 
    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {
    	HashSet<String> set = new HashSet<String>();
 
        for (String str : arr1) {
            set.add(str);
        }
 
        for (String str : arr2) {
            set.add(str);
        }
 
        String[] result = {  };
 
        return set.toArray(result);
	}

}

