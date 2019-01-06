/**
* Filename : App.java
* Author : huyn
* Creation time : 下午5:33:20 - 2019年1月6日
* Description :
*/
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "hello world world";
		//串长度,字符的个数
		System.out.println(str.length());
//		str =  "hello worl中";
		System.out.println(str.length());
		
		//charAt() 获取指定位置上的字符
		System.out.println(str.charAt(10));
		//复制String中的[],产生新的数组,不会影响原来的数组
		char[] arr = str.toCharArray();
		
		//返回子串在母串中的位置(索引值,以0 为基址)指定字符的位置索引
		int pos = str.indexOf("world",7);
		System.out.println(pos);
		
		String s1 = "3month";
		String s2 = "3year";
		String s3 = "3day";
		
		//判断是否以指定字符结尾
		System.out.println(s1.endsWith("year"));
		System.out.println(s1.startsWith("3"));
		
		
		str = "hello world";
		String[] atrArr =  str.split(" ");
		System.out.println(atrArr.length);
		//前包后不包
		System.out.println("hello world".substring(6,10));
		
		char a  = 97;
		a = 'a';
		a = '\uFFFF';//unicode 字符
		a = 0xffff;
		int ii = 5;
		ii = 05;
		ii = 0x5;
		System.out.println(a);
		
		int col = 0;
		for(int j = 0;j < 0xffff;j ++){
			System.out.print((char)j);
			col ++;
			if(col >= 80){
				col = 0;
				System.out.println();
			}
		}
	}

}
