/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午10:28:21 
* @Des:获取指定 URL 的响应头信息
*/ 

package com.meego.cainiao.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

public class GetUrlHeaderDemo {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		Map headersData = huc.getHeaderFields();
		Set<String> keys = headersData.keySet();
		for(String key : keys) {
			System.out.println(key + "  :   " + headersData.get(key));
		}
		System.out.println( huc.getLastModified() );
	}

}

