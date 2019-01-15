/** 
* @author:huyn 
* @version 创建时间：2019年1月15日 下午2:32:51 
* @Des:
*/

package com.meego.cainiao;

public class MathTestDemo {

	public static void main(String[] args) {
		System.out.println("90度的正弦值" + Math.sin(Math.PI/2));
		System.out.println("0度的余弦值" + Math.cos(0));
		System.out.println("60度的正切值" + Math.tan(Math.PI/3));
		System.out.println("1的反正切值" + Math.atan(1));
		System.out.println("90度的正弦值" + Math.sin(Math.PI/2));
		System.out.println("π/2的角度值" + Math.toDegrees(Math.PI/2));
		System.out.println(Math.PI/2);
		Long ab = 123123123L;
		/*"转换为 a 类型后该对象表示的数值,不需要任何参数*/
		System.out.println(ab.intValue());
		System.out.println(ab.byteValue());
		System.out.println(ab.floatValue());
		System.out.println(ab.longValue());
		
//		#相等返回0,小于返回-1,大于返回1
		//a.ompareTo()
		Integer xb = 5;
		System.out.println(xb.compareTo(3));
		System.out.println(xb.compareTo(5));
		System.out.println(xb.compareTo(8));
		
		//equals 如 Number 对象不为 Null，且与方法的参数类型与数值都相等返回 True，否则返回 False。
		//equals方法很重要
        Integer x = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;

        System.out.println(x.equals(y));  
        System.out.println(x.equals(z)); 
        System.out.println(x.equals(a));
        
        //toString() 方法用于返回以一个字符串表示的 Number 对象值。
        Integer w = 10;
        System.out.println(w.toString());
        System.out.println(Integer.toString(15));
        
        //parseInt()
        //parseInt(String s): 返回用十进制参数表示的整数值。
        //parseInt(int i): 使用指定基数的字符串参数表示的整数 (基数可以是 10, 2, 8, 或 16 等进制数)。
        int x1 =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);

        System.out.println(x1);
        System.out.println(c);
        System.out.println(b);
        
        //Math.abs()
        System.out.println(Math.abs(-9));
        
        //Math.ceil()方法可对一个数进行上舍入，返回值大于或等于给定的参数。
        //返回大于等于( >= )给定参数的的最小整数。
        System.out.println(Math.ceil(11.4));
        System.out.println(Math.ceil(-11.4));
        
        //Math.floor() 方法可对一个数进行下舍入，返回给定参数最大的整数，该整数小于或等给定的参数。\
        //返回小于等于（<=）给定参数的最大整数 。
        System.out.println(Math.floor(9.8));
        System.out.println(Math.floor(-9.8));
        
        //Math.rint() 方法返回最接近参数的整数值。小数位0-4返回整数部分,5-9 返回整数部分+1,返回值类型  float
        //返回与参数最接近的整数。返回类型为double。
        System.out.println(Math.rint(-99.6));
        
        //Math.round() 方法返回一个最接近的int、long型值。返回值类型  整型
        //它表示四舍五入，算法为 Math.floor(x+0.5)，即将原来的数字加上 0.5 后再向下取整，
        //所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
        System.out.println(Math.round(-99.6));
        
        //Math.max()	类型不一致时会自动转换类型
        System.out.println(Math.max(11.7, 12));
        
        //Math.exp(a)	返回自然数底数e的参数次方。
        System.out.println(Math.exp(2));
        //Math.log(a)
        System.out.println(Math.log(Math.exp(2)));
        
        //Math.pow(a, b)
//        double pow_a = 2.00;
//        double pow_b = 4.00;
        System.out.println(Math.pow(Math.log(Math.exp(2)),Math.exp(2)));
        
        //Math.sqrt() 方法用于返回参数的算术平方根。
        System.out.println(Math.sqrt(16));
        
        //Math.random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0
        double ranode_a = Math.random();
        System.out.println(ranode_a);
        System.out.println(Math.round(ranode_a * 10)); //返回大于0小于10的随机数字
        
	}

}
