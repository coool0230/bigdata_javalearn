/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午5:38:46 
* @Des:Java StringTokenizer 属于 java.util 包，用于分隔字符串。
*/ 

package com.meego.cainiao.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	/**StringTokenizer 构造方法：

	*1. StringTokenizer(String str) ：构造一个用来解析 str 的 StringTokenizer 对象。java 默认的分隔符是空格("")、制表符(\t)、换行符(\n)、回车符(\r)。
	*2. StringTokenizer(String str, String delim) ：构造一个用来解析 str 的 StringTokenizer 对象，并提供一个指定的分隔符。
	*3. StringTokenizer(String str, String delim, boolean returnDelims) ：构造一个用来解析 str 的 StringTokenizer 对象，并提供一个指定的分隔符，同时，指定是否返回分隔符。
	
	*************************************************************************************************************
	*StringTokenizer 常用方法：
	*1. int countTokens()：返回nextToken方法被调用的次数。
	*2. boolean hasMoreTokens()：返回是否还有分隔符。
	*3. boolean hasMoreElements()：返回是否还有分隔符。
	*4. String nextToken()：返回从当前位置到下一个分隔符的字符串。
	*5. Object nextElement()：返回从当前位置到下一个分隔符的字符串。
	*6. String nextToken(String delim)：与 4 类似，以指定的分隔符返回结果。*/
	public static void main(String[] args) {
        String str = "runoob,google,taobao,facebook,zhihu";
        // 以 , 号为分隔符来分隔字符串
        StringTokenizer st=new StringTokenizer(str,",");
        while(st.hasMoreTokens()) { 
            System.out.println(st.nextToken());
        }
        System.out.println("使用第一种构造函数：");
        StringTokenizer st1 = new StringTokenizer("Hello Runoob How are you", " ");
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
 
        System.out.println("使用第二种构造函数：");
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());
 
        System.out.println("使用第三种构造函数：");
        StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :",  true);
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
	}

}

