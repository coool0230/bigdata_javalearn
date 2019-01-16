/** 
* @author:huyn 
* @version 创建时间：2019年1月16日 上午11:55:58 
* @Des:当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
*和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
*StringBuffer是线程安全的，StringBuilder是非线程安全的
*由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
*然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
*/ 

package com.meego.cainiao;
public class StringBufferTestDemo {

	private static char z;

	public static void main(String[] args) {
	    StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
	    //public StringBuffer append(String s)
	    //将指定的字符串追加到此字符序列。
	    sBuffer.append("www");
	    sBuffer.append(".meego");
	    sBuffer.append(".com");
	    System.out.println(sBuffer); 
	    
	    //public StringBuffer reverse()
	    //将此字符序列用其反转形式取代。
	    System.out.println(sBuffer.reverse());
	    
	    //	public delete(int start, int end)
	    //移除此序列的子字符串中的字符。
	    System.out.println(sBuffer.delete(0, 2));
	    
	    //	public insert(int offset, int i)
	    //将 int 参数的字符串表示形式插入此序列中。
	    System.out.println(sBuffer.insert(0, "ASAA"));
	    
	    //	replace(int start, int end, String str)
	    //使用给定 String 中的字符替换此序列的子字符串中的字符。
	    
	    System.out.println(sBuffer.replace(0, 2, "123"));
	    
	    //int capacity()
	    //返回当前容量。
	    System.out.println(sBuffer.capacity());
	    
	    //	char charAt(int index)
	    //返回此序列中指定索引处的 char 值。
	    System.out.println(sBuffer.charAt(5));
	    
	    //void ensureCapacity(int minimumCapacity)
	    //确保容量至少等于指定的最小值。
	    //ensureCapacity()方法，该方法的作用是预先设置Arraylist的大小，这样可以大大提高初始化速度。
	    sBuffer.ensureCapacity(50);			//预设值sBuffer的容量大小
	    System.out.println(sBuffer.capacity());
	    
		//void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		//将字符从此序列复制到目标字符数组 dst。
	    char[] charArray = new char[9];
	    sBuffer.getChars(0, 5, charArray, 2);
	    for(char i : charArray) {
	    	System.out.println(i);
	    }
	    
	    
	    //	int indexOf(String str)
	    //返回第一次出现的指定子字符串在该字符串中的索引。
	    System.out.println(sBuffer.indexOf("ee"));
	    
	    //	int indexOf(String str, int fromIndex)
	    //从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。
	    System.out.println(sBuffer.indexOf(".",7));
	    
	    //	int lastIndexOf(String str)
	    //返回最右边出现的指定子字符串在此字符串中的索引。
	    //没有返回-1
	    System.out.println(sBuffer.lastIndexOf("4"));
	    
	    //	int length()
	    //返回长度（字符数）。
	    //容量是容量,长度时长度,但是长度一定小于容量
	    
	    System.out.println(sBuffer.length()+ "   " + sBuffer.capacity());
	    
	    //void setCharAt(int index, char ch)
	    //将给定索引处的字符设置为 ch。
	    char a = 'z';
	    sBuffer.setCharAt(0, a);
	    System.out.println(sBuffer);
	    
	    //void setLength(int newLength)
	    //设置字符序列的长度。
	    sBuffer.setLength(29);
	    System.out.println(sBuffer.length() + " " + sBuffer);
	    
	    //	CharSequence subSequence(int start, int end)
	    //返回一个新的字符序列，该字符序列是此序列的子序列。
	    System.out.println(sBuffer.subSequence(0, 9));
	    
	    //	String substring(int start)
	    //返回一个新的 String，它包含此字符序列当前所包含的字符子序列。
	    System.out.println(sBuffer.substring(0, 9));
	    
	    //String toString()
	    //返回此序列中数据的字符串表示形式。
	    System.out.println(sBuffer.toString());
	   
	    
	}

}

