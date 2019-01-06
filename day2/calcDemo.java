/**
* Filename : calcDemo.java
* Author : huyn
* Creation time : 下午8:23:45 - 2018年12月18日
* Description :
*/
package com.day2.com;
public class calcDemo {
	public static void main(String[] args){
		int a = +5;
		int b = -5;
		System.out.println("a=" + a+"b="+ b);
		System.out.println("a=" + (+a)+"b="+ (-b));
		// = - * /
		System.out.println(5 * 5);
		System.out.println(5 -5);
		System.out.println(5 +5);
		System.out.println("============="+((float)5/3*3));
		
		System.out.println(5%5);    //求余
		
		// ++   --
		int a1 = 5,a2= 5;
		System.out.println("a1="+(a1++)); 
		System.out.println("a1="+(++a2)); 
		
		//+操作符重载  字符串连接
		System.out.println("a1="+"aaaa"); 
		System.out.println("5 + 5 = " +5 + 5); 
		System.out.println("5 + 5 = " +(5 + 5)); 
		
		//赋值语句=     += -= *= /+ %=
		int a3 = 5;
		System.out.println("a3+= " +(a3+=5)); 
		
		//short
		short s = 2;
		s = (short)(s + 2);
		s+=2;
		System.out.println(s);
		
		//比较运算符  == <> >< !=
		System.out.println(5<=5);
		
		Object o = "hello";
		// instanceof  判断对象是否是类的对象
		// instanceof 后面跟的只能是 引用类型  class interface 数组[]
		System.out.println(o instanceof String);
		System.out.println(o instanceof Object);
		//System.out.println(o instanceof int);
		System.out.println(o instanceof Class);
		
		
		//逻辑运算符 常用双与  双或
		// && || 存在短路操作可能
		int c1 = 1,c2 = 3;
		if (c1 > 5 && c2 > 5){
			System.out.println("OK");
		}
		else{
			System.out.println("not ok");
		}
		
		//& | ! ^
		System.out.println((c1 > 5) & (c2 > 5));
		
		if ((c1>5)&(c2>5)){
			System.out.println("ok");
		}
		else{
			System.out.println("no ok");
		}
		//System.out.println(5 && 6);
		System.out.println(true && false);
		System.out.println(5 & 6);     //输出4    按位与
		//5   0000 0101
		//6   0000 0110
		//--------------
		//4  0000  0100
		System.out.println(5 | 6); //输出7      按位或 
		//5   0000 0101
		//6   0000 0110
		//--------------
		//7  0000  0111
		
		System.out.println(!true); //  !对boolean类型值取反
		
		//按位取反  ~
		System.out.println(~5);
		//5     0 0 0 0 0101   
		//-6    1  1 1 1   1010   按位取反
		
		
		//异或    ^   相同为假  不同为真
		//   0..0  0101    = 5
		// ^0..0  1100    = 12
		//-----------
		//   0..0  1001     = 9
		System.out.println(5 ^ 12);
		
		//移位运算    
		//<< 左移运算
		//>> 右移运算
		//       0000  0101 = 10
		//   000001   0100 = 40   <<2 左移两位运算  等同于乘以移动位数的2的指数倍
		System.out.println(10 << 2);
		System.out.println("6 << 2 = " + (6 << 2));
		System.out.println("-6 << 2 = " + (-6 << 2));
		// >> 有符号右移
		//>>> 无符号右移 空出的位用0填充
		System.out.println("-6 >>> 2 = " + (-6>>> 2));
		System.out.println("-6 >> 2 = " + (-6>> 2));
		System.out.println("-1 >> 3 = " + (-1>> 3));//-1 有符号右移,一直是-1,因为位数都是1
		System.out.println("-1 >>> 3 = " + (-1>>> 3));
		
		
		//三元运算符    ? : ;
		int i1 = 10;
		if (i1 < 5){
			System.out.println("<5");
		}
		else{
			System.out.println(">5");
		}
		System.out.println(i1>5?">5":"<5");
		
		int q = 5,w = 6;
		System.out.println(q>w?q:w);
		
		
		int x = 5,y = 6, z=7;
		//三元运算符嵌套
		System.out.println(x>y?(x>z?x:z):(y>z?y:z));
		
	}

}
