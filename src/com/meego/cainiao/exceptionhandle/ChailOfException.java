/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午3:08:24 
* @Des:使用多个 catch 来处理链试异常
*/ 

package com.meego.cainiao.exceptionhandle;
public class ChailOfException {

	public static void main(String[] args) throws Exception{
        int n=20,result=0;
        try{
            result=n/0;
            System.out.println("结果为"+result);
        }
        catch(ArithmeticException ex){
            System.out.println("发算术异常: "+ex);
            try {
                throw new NumberFormatException();
            }
            catch(NumberFormatException ex1) {
                System.out.println("手动抛出链试异常 : "+ex1);
            }
        }
	}

}

