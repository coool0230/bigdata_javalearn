/** 
* @author:huyn 
* @version 创建时间：2019年1月15日 下午4:07:07 
* @Des:
*/

package com.meego.cainiao;
public class CharacterTestDemo {

	public static void main(String[] args) {
		/**
		 * 转移字符
		 * \t	tab键
		 * \b	后退键
		 * \n	换行
		 * \r	回车
		 * \f	换页符
		 * \'	插入单引号'
		 * \"	插入双引号"
		 * \\	插入斜杠\
		 */
		
		//Character.isLetter() 方法用于判断指定字符是否为字母。
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('5'));
		
		//Character.isDigit() 方法用于判断指定字符是否为数字。
		
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('5'));
		
		//Character.isWhitespace() 方法用于判断指定字符是否为空白字符，空白符包含：空格、tab键、换行符。
		System.out.println("--------------------isWhitespace-----------------------------------");
		System.out.println(Character.isWhitespace('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println("\b" + Character.isWhitespace('\b'));		//非空白字符
		System.out.println(Character.isWhitespace('\r'));
		System.out.println(Character.isWhitespace('\f'));
		System.out.println("--------------------isWhitespace-----------------------------------");
		
		
		
		//Character.isUpperCase() 方法用于判断指定字符是否为大写字母。
		//Character.isLowerCase() 方法用于判断指定字符是否为小写字母。
		
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('C'));
		
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		
		
		//Character.toUpperCase() 方法用于将小写字符转换为大写。
		//Character.toLowerCase() 方法用于将大写字符转换为小写。
		
		//Character.toString() 方法用于返回一个表示指定 char 值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。
		
		
	}

}

