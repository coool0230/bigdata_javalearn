/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午9:34:54 
* @Des:使用 Socket 类的 accept() 方法和 ServerSocket 类的 MultiThreadServer(socketname) 方法来实现多线程服务器程序
*/ 

package com.meego.cainiao.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketRealizeThreading implements Runnable{
//	Socket csocket;
//	SocketRealizeThreading(Socket csocket){
//		this.csocket = csocket;
//	}
//	
//	public static void main(String[] args) throws IOException {
//		ServerSocket ssocket = new ServerSocket(999);
//		System.out.println("Listening");
//		while(true) {
//			Socket sock = ssocket.accept();
//			System.out.println("Connected");
//			new Thread(new SocketRealizeThreading(sock)).start();
//		}
//		
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Runnable#run()
//	 */
//	@Override
//	public void run() {
//		try {
//			PrintStream pstream = new PrintStream(csocket.getOutputStream());
//			for(int i = 100;i < 0; i --) {
//				pstream.println(i + " bottles of beer on the wall");
//			}
//	        pstream.close();
//	        csocket.close();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//}
	
	   Socket csocket;
	   SocketRealizeThreading(Socket csocket) {
	      this.csocket = csocket;
	   }
	 
	   public static void main(String args[]) 
	   throws Exception {
	      ServerSocket ssock = new ServerSocket(1234);
	      System.out.println("Listening");
	      while (true) {
	         Socket sock = ssock.accept();
	         System.out.println("Connected");
	         new Thread(new SocketRealizeThreading(sock)).start();
	      }
	   }
	   public void run() {
	      try {
	         PrintStream pstream = new PrintStream
	         (csocket.getOutputStream());
	         for (int i = 100; i >= 0; i--) {
	            pstream.println(i + 
	            " bottles of beer on the wall");
	         }
	         pstream.close();
	         csocket.close();
	      }
	      catch (IOException e) {
	         System.out.println(e);
	      }
	   }
	}

