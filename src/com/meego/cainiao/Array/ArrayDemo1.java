/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午2:20:58 
* @Des:使用sort()方法对Java数组进行排序，及如何使用 binarySearch() 方法来查找数组中的元素
*/ 

package com.meego.cainiao.Array;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[] =  { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(a);
		printArray("数组排序结果为", a);
        int index = Arrays.binarySearch(a, 2);
        //第一个参数是数组,第二个参数是元素,返回结果是元素在数组中的下标
        System.out.println("元素 2  在第 " + index + " 个位置");
	}
	
	
	public static void printArray(String msg,int array[]) {
        System.out.print(msg 
        		+ ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
	}
}

