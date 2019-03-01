/** 
* @author:huyn 
* @version 创建时间：2019年2月27日 下午5:24:34 
* @Des:使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址
*/ 

package com.meego.cainiao.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetSpecialEquipmentIPAddress {

	public static void main(String[] args) {
		InetAddress address = null;
		try {
			address = InetAddress.getByName("192.168.3.238");
			System.out.println(address);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println(address.getHostName()+ ":" + address.getHostAddress());
		System.exit(2);

	}

}

