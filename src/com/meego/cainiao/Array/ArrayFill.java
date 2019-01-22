/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午4:11:18 
* @Des:数组填充
*/ 

package com.meego.cainiao.Array;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        for (int i=0, n=array.length; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 1, 3, 50);
        for (int i=0, n=array.length; i< n; i++) {
            System.out.println(array[i]);
        }
	}

}

