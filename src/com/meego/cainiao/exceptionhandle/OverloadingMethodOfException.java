/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午2:55:09 
* @Des:重载方法的异常处理
*/ 

package com.meego.cainiao.exceptionhandle;
public class OverloadingMethodOfException {
	double method(int i) throws Exception{
		return i/0;
	}
	boolean method(boolean b) {
		return !b;
	}
	static double method(int x, double y) throws Exception  {
        return x + y ;
    }
    static double method(double x, double y) {
        return x + y - 3;
    } 

	public static void main(String[] args) {
		OverloadingMethodOfException omoe = new OverloadingMethodOfException();
		try {

		System.out.println(method(9.9, 7.2));;
		System.out.println(method(10, 1.1));;
		System.out.println(omoe.method(true));;
		System.out.println(omoe.method(10));;
	}
		catch(Exception e) {
			 System.out.println("exception occoure: "+ e);
		}
	}
}

