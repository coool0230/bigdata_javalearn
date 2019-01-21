/** 
* @author:huyn 
* @version 创建时间：2019年1月21日 上午11:22:02 
* @Des:我们定义了如下的Employee类，该类实现了Serializable 接口。
* Serializable接口没有定义任何方法
* public interface Serializable {}
* 
*/ 

package com.meego.cainiao;
public class EmployeeDemo implements java.io.Serializable {
	/**
	 * transient 修饰符
	 * 序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
	 * 该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。
	 * public transient int limit = 55;   // 不会持久化
	 * public int b; // 持久
	 */
		public String name;
		public String address;
		public transient int SSN;
		public int number;
		public void mailCheck(){
			System.out.println("Mailing a check to " + name
		                           + " " + address);
		}
}

