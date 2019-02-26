/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午2:51:26 
* @Des:使用异常类的 printStack() 方法来获取堆栈信息
*/ 

package com.meego.cainiao.exceptionhandle;
public class GetExceptionOfStackMessage {

	public static void main(String[] args) {
		int[] arr = {11,12,13};
		int num1 = 15,num2 = 10,result = 10;
		try {
			result = num1/num2;
			System.out.println("num1 / num2 = " + result);
			for(int i = 5;i >= 0; i --) {
				System.out.println("arr元素的值分别为:" + arr[i]);
			}
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
	}

}

