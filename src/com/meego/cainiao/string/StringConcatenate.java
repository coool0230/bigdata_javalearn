/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午2:12:23 
* @Des:通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能
*/ 

package com.meego.cainiao.string;
public class StringConcatenate {
	/**
	 * 当需要对字符串对象的长度进行变化时，用 + 拼接的性能在循环时就会慢的慢的多
	 * 实际上 + 号拼接字符串也是通过 StringBuild 或 StringBuffer 实现的
	 * 但当进行频繁的修改本身时，+ 拼接会比直接用方法拼接产生更多的中间垃圾对象，耗用更多的内存
	 * 因此更推荐使用 StringBuild。其实我认为上述案例的性能分析是没有意义的
	 * 如果明确了要拼接的字符串的话，完全可以直接使用两种如下代码
	 * result =result +  "This is esting the difference between String and StringBuffer ";
	 * result.append("This is esting the difference between String and StringBuffer" );
	 */

	public static void main(String[] args) {
		String result1 = null;
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
        	result1 += "This is"
//            String result = "This is"
            + "testing the"
            + "difference"+ "between"
            + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接" 
        + " - 使用 + 操作符 : " 
        + (endTime - startTime)+ " ms");
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接" 
        + " - 使用 StringBuffer : "
        + (endTime1 - startTime1)+ " ms");
	}

}

