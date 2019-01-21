/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 下午4:57:01 
* @Des:compareTo() 方法用于两种方式的比较：
* 字符串与对象进行比较。
* 按字典顺序比较两个字符串。
*/ 

package com.meego.cainiao.string;
public class StringCompareDemoString {
	/**
	 * 返回值是整型,它是先比较对应字符的大小(ASCII码顺序),如果第一个字符和参数的第一个字符不等,结束比较,两个字符之间的差值,
	 * 如果第一个字符和参数的第一个字符相等,则以第二个字符和参数的第二个字符做比较,以此类推,直至比较的字符或被比较的字符有一方。
	 * 如果参数字符串等于此字符串，则返回值 0；
	 * 如果此字符串小于字符串参数，则返回一个小于 0 的值(与被比较字符串长度的差值)；
	 * 如果此字符串大于字符串参数，则返回一个大于 0 的值(与被比较字符串长度的差值)。
	 */

	public static void main(String[] args) {
        String str1 = "Strings";
        String str2 = "Stringt";
        String str3 = "Strings123";
 
        int result = str1.compareTo( str2 );
        System.out.println(result);
      
        result = str2.compareTo( str3 );
        System.out.println(result);
     
        result = str3.compareTo( str1 );
        System.out.println(result);
	}

}
