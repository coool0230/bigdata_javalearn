/** 
* @author:huyn 
* @version 创建时间：2019年1月16日 下午2:57:57 
* @Des:Date模块
* java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
* 第一个构造函数使用当前日期和时间来初始化对象。Date()
* 第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数。
* Date(long millisec)
*/ 

package com.meego.cainiao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDateTestDemo {

	public static void main(String[] args) {
	       // 初始化 Date 对象
	       Date date = new Date();
	        
	       // 使用 toString() 函数显示日期时间
	       System.out.println(date.toString());
	       
	       //SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。SimpleDateFormat 
	       //允许你选择任何用户自定义日期时间格式来运行。
	       //hh   	A.M./P.M. (1~12)格式小时
	       //HH		一天中的小时 (0~23)
	       //s		秒数
	       //S		毫秒数
	       //E		星期几
	       //D		一年中的日子
	       //F		一个月中第几周的周几
	       //w		一年中第几周
	       //W		一个月中第几周
	       
	       
	       
	       Date dNow = new Date( );
	       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
	  
	       System.out.println("当前时间为: " + ft.format(dNow));
	       
	       
	       /**
	        * 
			*转  换  符				说    明						示    例
			*	c			包括全部日期和时间信息		星期六 十月 27 14:21:20 CST 2007
			*F				"年-月-日"格式			2007-10-27
			*D				"月/日/年"格式			10/27/07
			*r			"HH:MM:SS PM"格式（12时制）	02:25:51 下午
			*T			"HH:MM:SS"格式（24时制）		14:28:16
			*R			"HH:MM"格式（24时制）		14:28
	        */
	       
	       Date date_now = new Date();
	       
	       //c的使用  
	      System.out.printf("全部日期和时间信息：%tc%n",date_now);          
	      //f的使用  
	      System.out.printf("年-月-日格式：%tF%n",date_now);  
	      //d的使用  
	      System.out.printf("月/日/年格式：%tD%n",date_now);  
	      //r的使用  
	      System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date_now);  
	      //t的使用  
	      System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date_now);  
	      //R的使用  
	      System.out.printf("HH:MM格式（24时制）：%tR%n",date_now);  
	      
	      System.out.printf("%tD %tT%n",date_now,date_now); 
	      
	      //创建一个代表系统当前日期的Calendar对象
	      Calendar c = Calendar.getInstance();//默认是当前日期
	      System.out.println(c);
	      
	    //创建一个代表2009年6月12日的Calendar对象
	      Calendar c1 = Calendar.getInstance();
	      c1.set(2009, 6 - 1, 12);
	      System.out.println(c1);
	      
	      /**
	       * Calendar类中用以下这些常量表示不同的意义，jdk内的很多类其实都是采用的这种思想
	       *		常量						描述
	       *Calendar.YEAR					年份
	       *Calendar.MONTH					月份
	       *Calendar.DATE					日期
	       *Calendar.DAY_OF_MONTH		日期，和上面的字段意义完全相同
	       *Calendar.HOUR					12小时制的小时
	       *Calendar.HOUR_OF_DAY			24小时制的小时
	       *Calendar.MINUTE					分钟
	       *Calendar.SECOND					秒
	       *Calendar.DAY_OF_WEEK			星期几
	       */
	      //如果只设定某个字段，例如日期的值，则可以使用如下set方法：
	      c1.set(Calendar.DATE,10);
	      //把 c1对象代表的日期设置为10号，其它所有的数值会被重新计算
	      
	      //把c1对象的日期加上10，也就是c1也就表示为10天后的日期，其它所有的数值会被重新计算
	      c1.add(Calendar.DATE, 10);
	      
	      //把c1对象的日期减去10，也就是c1也就表示为10天前的日期，其它所有的数值会被重新计算
	      c1.add(Calendar.DATE, -9);
	      
	      
//	      Calendar c11 = Calendar.getInstance();
//	      // 获得年份
//	      int year = c11.get(Calendar.YEAR);
//	      // 获得月份
//	      int month = c11.get(Calendar.MONTH) + 1;
//	      // 获得日期
//	      int date1 = c11.get(Calendar.DATE);
//	      // 获得小时
//	      int hour = c11.get(Calendar.HOUR_OF_DAY);
//	      // 获得分钟
//	      int minute = c11.get(Calendar.MINUTE);
//	      // 获得秒
//	      int second = c11.get(Calendar.SECOND);
//	      // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
//	      int day = c11.get(Calendar.DAY_OF_WEEK);


	      
	}

}

