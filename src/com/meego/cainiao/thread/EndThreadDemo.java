/** 
* @author:huyn 
* @version 创建时间：2019年3月1日 上午11:07:27 
* @Des:使用interrupt方法来终端线程可分为两种情况
* 	（1）线程处于阻塞状态，如使用了sleep方法。
* 	（2）使用while（！isInterrupted（））{……}来判断线程是否被中断。
* 	在第一种情况下使用interrupt方法，sleep方法将抛出一个InterruptedException例外，而在第二种情况下线程将直接退出。
* 	演示了在第一种情况下使用interrupt方法
*/ 

package com.meego.cainiao.thread;

import java.io.IOException;

public class EndThreadDemo extends Thread{
	public void run() {
		try {
			sleep(50000);
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage()); 
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Thread thread = new EndThreadDemo(); 
		thread.start();
		System.out.println("在50秒之内按任意键中断线程!");
		System.in.read(); 
		thread.interrupt(); 
		thread.join(); 
		System.out.println("线程已经退出!");
	}

}

