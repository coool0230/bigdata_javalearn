/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午4:18:09 
* @Des:数组初始化后对数组进行扩容,还是利用System.arraycopy()方法
*/ 

package com.meego.cainiao.Array;
public class ArrayExtend {

	public static void main(String[] args) {
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended){
            System.out.println(str);
        }
	}

}

