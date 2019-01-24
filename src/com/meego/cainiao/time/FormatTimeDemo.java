/** 
* @author:huyn 
* @version 创建时间：2019年1月23日 上午9:22:55 
* @Des:使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
*/ 

package com.meego.cainiao.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTimeDemo {

	public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String strDateFormat = "yMMddHHmmss";
        System.out.println(strDateFormat);
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
	}

}

