/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午2:02:26 
* @Des:使用 System 类的 System.err.println() 来展示异常的处理方法
*/ 

package com.meego.cainiao.exceptionhandle;
public class ErrorHandleMethod {

	public static void main(String[] args) {
		 try {
	            throw new Exception("My Exception");
	        } catch (Exception e) {
	            System.err.println("Caught Exception");
	            System.err.println("getMessage():" + e.getMessage());
	            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
	            System.err.println("toString():" + e);
	            System.err.println("printStackTrace():");
	            e.printStackTrace();
	        }
	}

}

