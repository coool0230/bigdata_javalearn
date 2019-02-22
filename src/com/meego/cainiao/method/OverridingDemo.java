/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午2:38:35 
* @Des:
* 	方法重载(Overloading)：如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。
* 	方法覆盖（Overriding）：如果在子类中定义一个方法，其名称、返回类型及参数签名正好与父类中某个方法的名称、返回类型及参数签名相匹配，那么可以说，子类的方法覆盖了父类的方法。
*/ 

package com.meego.cainiao.method;
public class OverridingDemo {

	public static void main(String[] args) {
		AAA ademo1 = new AAA(9,10);
		System.out.println(ademo1.area());
		BBB bdemo1 = new BBB(9,10);
		System.out.println(bdemo1.area());
	}

}

class AAA{
	double a;
	double b;
	AAA(double x,double y){
		a = x;
		b = y;
	}
	Double area() {
		System.out.println("面积大小是:");
		return a * b;
	}
}

class BBB extends AAA{
	BBB(double x,double y){
		super(x,y);
	}
	
	Double area() {
		System.out.println("覆盖方法面积大小是:");
		return (a * b * 2);
	}
}
