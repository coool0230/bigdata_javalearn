/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:12:52 
* @Des:使用 net.URL 类的 URL() 构造函数来抓取网页
*/ 

package com.meego.cainiao.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlGrab {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.runoob.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	    BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
	    String line;
	    while ((line = reader.readLine()) != null) {
	    	System.out.println(line);
	        writer.write(line);
	        writer.newLine();
	    }
	    reader.close();
	    writer.close();
	}

}

