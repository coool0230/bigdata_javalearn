/**  ]吗 /
 * 
* @author:huyn 
* @version 创建时间：2019年1月15日 下午4:54:38 
* @Des:
*/


package com.meego.cainiao;

import java.io.UnsupportedEncodingException;

public class StringTestDemo {

	public static void main(String[] args) {
		String s = "Hello Wrold";
		String s1 = "Hello Wrold";
		//s.charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
		System.out.println(s.charAt(7));
		
		
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "StringA";
 
        int result = str1.compareTo( str2 );
        System.out.println(result);
      
        result = str2.compareTo( str3 );	//返回不同处的差值  asc?
        System.out.println(result);
     
        result = str3.compareTo( str1 );
        System.out.println(result);
        
        
        //s.concat() 方法用于将指定的字符串参数连接到字符串上。
        System.out.println(s.concat("AABB"));
        
        //s.contentEquals() 方法用于将此字符串与指定的 StringBuffer 比较。
        System.out.println(s.contentEquals(s1));		//约等于 ==   判断两个字符串是否相等
        
        //public static String copyValueOf(char[] data): 返回指定数组中表示该字符序列的字符串。

        //public static String copyValueOf(char[] data, int offset, int count): 返回指定数组中表示该字符序列的 字符串。	
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};
        String s2 = null ;
        System.out.println(s2.copyValueOf(Str1));
        System.out.println(s2.copyValueOf(Str1,3,6));
        
        
        //endsWith() 方法用于测试字符串是否以指定的后缀结束。
        System.out.println(s.endsWith("ld"));
        System.out.println(s.endsWith("l"));
        
        //equals() 方法用于将字符串与指定的对象比较。相等返回true 不相等返回false
        //equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
        String s3 = "Hello World";		//Hello Wrold
        String s4 = "hello world";
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(s.equalsIgnoreCase(s3));
        
        // 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        String Str11 = new String("runoob");
        
        try{
            byte[] Str2 = Str11.getBytes();
            System.out.println("返回值：" + Str2 );
            for(byte b : Str2) {
            	//返回的byte[] 数组中存放的是字符串响应位置对应的字母的哈希值
            	System.out.println(b); 			//返回的 byte[] 数组的长度，与原字符串的长度相等。
            }
            
            Str2 = Str11.getBytes( "UTF-8" );
            System.out.println("返回值：" + Str2 );
            
            Str2 = Str11.getBytes( "ISO-8859-1" );
            System.out.println("返回值：" + Str2 );
        } catch ( UnsupportedEncodingException e){
            System.out.println("不支持的字符集");
        }
        //getChars() 方法将字符从字符串复制到目标字符数组。
        String Str111 = new String("www.runoob.com");
        char[] Str2 = new char[8];

        try {
            Str111.getChars(1, 7, Str2, 2);		//最后一个参数是  Str2  的起始位置
            System.out.print("拷贝的字符串为：" );
            System.out.println(Str2 );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }
        
        //hashCode() 方法用于返回字符串的哈希码。
        String Str = new String("www.runoob.com");
        System.out.println("字符串的哈希码为 :" + Str.hashCode() );
        
        //intern() 方法返回字符串对象的规范化表示形式。
        //对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
        //?
        
        String s41 = "hello go";
        String s411 = "hello go";
        
        System.out.println(s41.intern());
        System.out.println(s411.intern());
        
        //matches() 方法用于检测字符串是否匹配给定的正则表达式。
        String Str1111 = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str1111.matches("(.*)runoob(.*)"));
        
        System.out.print("返回值 :" );
        System.out.println(Str1111.matches("(.*)google(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str1111.matches("www(.*)"));
        
        
	}
	
}

