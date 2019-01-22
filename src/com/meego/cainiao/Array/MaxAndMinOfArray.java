/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午3:53:45 
* @Des:通过 Collections 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值
*/ 

package com.meego.cainiao.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        //Arrays.asList() 将传入的数组 转为 列表
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        
        List<Integer>  arr;
        arr = Arrays.asList(numbers);
        //Collections.sort(numbers); 		//数组不能使用sort方法,sort方法必须传入列表
        Collections.sort(arr);
        for(Integer i : arr) {
        	System.out.println(i);
        }
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
	}

}

