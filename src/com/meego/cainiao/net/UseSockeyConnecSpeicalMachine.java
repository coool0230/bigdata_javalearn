/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:09:06 
* @Des:使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机
*/ 

package com.meego.cainiao.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UseSockeyConnecSpeicalMachine {

	public static void main(String[] args) {
		
		try {
			InetAddress addr;
			Socket sock = new Socket("www.runoob.com", 80);
			addr = sock.getInetAddress();
			System.out.println("连接到 " + addr);
			sock.close();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("无法连接 " + args[0]);
			System.out.println(e);
			e.printStackTrace();
		}
	}

}

