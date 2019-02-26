/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午3:10:19 
* @Des:通过继承 Exception 来实现自定义异常
*/ 

package com.meego.cainiao.exceptionhandle;
class SelfException extends Exception{
	SelfException(String s){
		super(s);
	}
}

class InputTest{
	void method() throws SelfException{
		throw new SelfException("Wrong input"); // 抛出自定义的类
	}
}
public class CustomOfException {

	public static void main(String[] args) {
		try {
			new InputTest().method();
		}
		catch(SelfException e) {
			System.out.println(e.getMessage());
		}
	}

}

