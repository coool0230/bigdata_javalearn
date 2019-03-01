/** 
* @author:huyn 
* @version 创建时间：2019年2月28日 上午9:56:21 
* @Des:查看主机指定文件的最后修改时间
*/ 

package com.meego.cainiao.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckSpecilMacFileLastModifyTime {

	public static void main(String[] args) throws IOException {
		URL u = new URL("http://127.0.0.1/test/test.html");
		URLConnection uc = u.openConnection();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		uc.setUseCaches(false);
		long timestamp = uc.getLastModified();
		System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));
	}

}

