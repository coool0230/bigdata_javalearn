/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:23:58 
* @Des:使用 HttpURLConnection 的 httpCon.getDate() 方法来获取 URL响应头的日期信息
*/ 

package com.meego.cainiao.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class GetUrlHeaderOfDateDemo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		HttpURLConnection hurlconnec = (HttpURLConnection) url.openConnection();
		long date = hurlconnec.getDate();
		if(date == 0) {
			System.out.println("无法获取信息。");
		}
		else {
			System.out.println("Date: " + new Date(date));
		}
	}

}

