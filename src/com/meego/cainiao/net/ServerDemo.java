/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:47:11 
* @Des:实现客户端发送消息到服务器，服务器接收到消息并读取输出，然后写出到客户端客户端接收到输出
* 服务器建立通信ServerSocket
* 服务器建立Socket接收客户端连接
* 建立IO输入流读取客户端发送的数据
* 建立IO输出流向客户端发送数据消息
*/ 

package com.meego.cainiao.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("启动服务器....");
		Socket ssa = ss.accept();
		System.out.println("客户端:"+ssa.getInetAddress().getLocalHost()+"已连接到服务器");
		BufferedReader br = new BufferedReader(new InputStreamReader(ssa.getInputStream()));
		//读取客户端发送来的消息
		String mess = br.readLine();
		System.out.println("客户端："+mess);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ssa.getOutputStream()));
		bw.write(mess+"\n");
		bw.flush();
	}

}

/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:52:31 
* @Des:实现客户端发送消息到服务器，服务器接收到消息并读取输出，然后写出到客户端客户端接收到输出
* 创建Socket通信，设置通信服务器的IP和Port
* 建立IO输出流向服务器发送数据消息
* 建立IO输入流读取服务器发送来的数据消息
*/ 


/**
 * 编译java文件: javac ***.java
 * 运行已经编译的.class文件,当class文件不在classpath时:   "java -classpath C:\b\c\d  name"			\\name为文件主名,不包含文件名后缀
 * 					当java文件有导入包时			  "java -classpath C:\b		 b.c.d.name"	\\b.c.d为包名,本质为路径path,必须以包的外层路径开始
 */

