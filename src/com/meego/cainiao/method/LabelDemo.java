/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午3:29:54 
* @Des:
* Java 中的标签是为循环设计的，是为了在多重循环中方便的使用break 和coutinue 。
*/ 

package com.meego.cainiao.method;
public class LabelDemo {

	public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        a:
        for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    continue a;
                }
            }
            found = true;
            break a;
        }
        if (found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}

