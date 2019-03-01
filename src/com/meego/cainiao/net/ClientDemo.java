

package com.meego.cainiao.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",8888);
	        InputStream is = s.getInputStream();
	        OutputStream os = s.getOutputStream();
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
	        bw.write("Test client and server socket,server get mess back to client \n");
	        bw.flush();
	        BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        String mess = br.readLine();
	        System.out.println("Server:"+mess);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

