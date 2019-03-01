/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午9:20:42 
* @Des:使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
*/ 

package com.meego.cainiao.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetThisMachine {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("Local HostAddress: "+addr.getHostAddress());
			String hostname = addr.getHostName();
			System.out.println("Local host name: "+hostname);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}

}

