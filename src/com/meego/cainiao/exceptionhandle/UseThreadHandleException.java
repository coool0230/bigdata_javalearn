/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午2:43:53 
* @Des:多线程异常处理方法
*/ 

package com.meego.cainiao.exceptionhandle;


class MyThreadDemo extends Thread{
	public void run() {
		System.out.println("Throwing in " +"MyThread");
		throw new RuntimeException();
	}
}

public class UseThreadHandleException {

	public static void main(String[] args) {
		MyThreadDemo mtd = new MyThreadDemo();
		mtd.start();
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("Caught it" + e);
		}
		System.out.println("Exiting main");
	}

}

