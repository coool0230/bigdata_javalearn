/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午3:01:01 
* @Des:
* Java continue 语句语句用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行。
*/ 

package com.meego.cainiao.method;
public class ContinueDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello,how how are you!!!");
		int count = 0;
		for(int i= 0;i < str.length();i ++) {
			if(str.charAt(i) != 'h') 
				continue;
				count ++;
//				str.setCharAt(i, 'h');
		}
        System.out.println("发现 " + count 
        + " 个 h 字符");
        System.out.println(str);
	}

}

