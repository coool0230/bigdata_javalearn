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
        
        //regionMatches() 方法用于检测两个字符串在一个区域内是否相等。
        //第一个参数,ignoreCase -- 如果为 true，则比较字符时忽略大小写。默认为true
        //toffset -- 此字符串中子区域的起始偏移量。   s1.regionMatched(true,a,s2,b,c)   a代表的是s1的起始位置
        //b代表s2的起始位置,c 代表s2从b开始后的length
        
        String Str11111 = new String("www.runoob.com");
        String Str21 = new String("qqrunodddd");
        String Str3 = new String("RUNOOB");
        
        
        System.out.println(">>>>>>>>>>>>>>>>>regionMatches>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("返回值 :" );
        System.out.println(Str11111.regionMatches(4, Str21, 2, 4));

        System.out.print("返回值 :" );
        System.out.println(Str11111.regionMatches(4, Str3, 0, 5));

        System.out.print("返回值 :" );
        System.out.println(Str11111.regionMatches(true, 4, Str3, 0, 5));
        
        //replaceAll() 方法使用给定的参数 replacement 替换字符串所有匹配给定的正则表达式的子字符串。
        //成功则返回替换的字符串，失败则返回原始字符串。
        //replaceFirst() 方法使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
        //成功则返回替换的字符串，失败则返回原始字符串。
        //s1.replaceAll(String regex, String replacement)
        //直接用指定字符串去匹配,返回替换后的字符串
        /**
         * regex -- 匹配此字符串的正则表达式。

         * newChar -- 用来替换每个匹配项的字符串。
         */
        System.out.println("---------------->replaceAll()----------------->");
        
        String a1 = "www.google.com";
        String a2 = "meego";
        
        System.out.println(a1.replaceAll("(.*)google(.*)", a2));
        System.out.println(a1.replaceAll("(.*)baidu(.*)", a2));
        System.out.println(a1.replaceAll("www", a2));
        
        
        String Str111111 = new String("hello runoob，I am from runoob。");
        
        
        System.out.print("返回值 :" );
        System.out.println(Str111111.replaceFirst("(.*)runoob(.*)", "google" ));	//返回替换后的字符
        System.out.println(Str111111);
        System.out.print("返回值 :" );
        System.out.println(Str111111.replaceFirst("hello", "google" ));		//返回替换后的字符串
        System.out.println(Str111111);
        
        //split() 方法根据匹配给定的正则表达式来拆分字符串。
        //Tips  :    . 、 | 和 * 等转义字符，必须得加 \\。
        //regex -- 正则表达式分隔符。

        //limit -- 分割的份数。
        
        String str = new String("Welcome-to-Runoob");
        
        System.out.println("- 分隔符返回值 :" );
        for (String retval: str.split("-")){
            System.out.println(retval);
        }
 
        System.out.println("");
        System.out.println("- 分隔符设置分割份数返回值 :" );
        for (String retval: str.split("-", 2)){
            System.out.println(retval);
        }
 
        System.out.println("");
        String str21 = new String("www.runoob.com");
        System.out.println("转义字符返回值 :" );
        for (String retval: str21.split("\\.", 3)){
            System.out.println(retval);
        }
 
        System.out.println("");
        String str31 = new String("acount=? and uu =? or n=?");
        System.out.println("多个分隔符返回值 :" );
        for (String retval: str31.split("and|or")){
            System.out.println(retval);
        }
        
        
        //startsWith() 方法用于检测字符串是否以指定的前缀开始。
        //prefix -- 前缀。

        //toffset -- 字符串中开始查找的位置。
        //如果字符串以指定的前缀开始，则返回 true；否则返回 false。
        String Str221 = new String("www.runoob.com");
        
        System.out.print("返回值 :" );
        System.out.println(Str221.startsWith("www") );
 
        System.out.print("返回值 :" );
        System.out.println(Str221.startsWith("runoob") );
 
        System.out.print("返回值 :" );
        System.out.println(Str221.startsWith("runoob", 4) );
        
        
        //subSequence() 方法返回一个新的字符序列，它是此序列的一个子序列。
        //substring() 方法返回字符串的子字符串。
        /**返回类型不一样，subString返回的是String，subSequence返回的是实现了CharSequence接口的类，
         *也就是说使用subSequence得到的结果，只能使用CharSequence接口中的方法。不过在String类中已经重写了subSequence，
         * 调用subSequence方法，可以直接下转为String对象。
        */
        //返回一个新的字符序列，它是此序列的一个子序列。
        String Str2221 = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str2221.subSequence(4, 10) );
        
        
        //toCharArray() 方法将字符串转换为字符数组。
        String Str1111111 = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println( Str1111111.toCharArray() );
        for(char i : Str1111111.toCharArray()) {
        	System.out.println(i);
        }
        
        //toLowerCase() 方法将字符串转换为小写。
        //toUpperCase() 方法将字符串小写字符转换为大写。
        
        String Str11111111 = new String("WWW.RUNOOB.COM");

        System.out.print("返回值 :" );
        System.out.println( Str11111111.toLowerCase());
        System.out.println(Str11111111.toLowerCase().toUpperCase());
        
        //toString() 方法返回此对象本身（它已经是一个字符串）。
        
        //trim() 方法用于删除字符串的头尾空白符。
        String Str111111111 = new String("    www.runoob.com    ");
        System.out.print("原始值 :" );
        System.out.println( Str111111111 );

        System.out.print("删除头尾空白 :" );
        System.out.println( Str111111111.trim() );
    
        
        
       /**
        * valueOf(boolean b): 返回 boolean 参数的字符串表示形式。.

        *valueOf(char c): 返回 char 参数的字符串表示形式。

        *valueOf(char[] data): 返回 char 数组参数的字符串表示形式。

        *valueOf(char[] data, int offset, int count): 返回 char 数组参数的特定子数组的字符串表示形式。

        *valueOf(double d): 返回 double 参数的字符串表示形式。

        *valueOf(float f): 返回 float 参数的字符串表示形式。

        *valueOf(int i): 返回 int 参数的字符串表示形式。

        *valueOf(long l): 返回 long 参数的字符串表示形式。

        *valueOf(Object obj): 返回 Object 参数的字符串表示形式 
        */
        double d = 1100.00;
        boolean b = true;
        long l = 1234567890;
        char[] arr = {'r', 'u', 'n', 'o', 'o', 'b' };

        System.out.println("返回值 : " + String.valueOf(d) );
        System.out.println("返回值 : " + String.valueOf(b) );
        System.out.println("返回值 : " + String.valueOf(l) );
        System.out.println("返回值 : " + String.valueOf(arr) );

        
        
        
        
        
        
        
	
	}     
}

