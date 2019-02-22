/** 
* @author:huyn 
* @version 创建时间：2019年2月22日 下午3:50:55 
* @Des:
* Java1.5提供了一个叫varargs的新功能，就是可变长度的参数。
* "Varargs"是"variable number of arguments"的意思。有时候也被简单的称为"variable arguments" 
* 	定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."（即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配。
* a可变参数类型必须放在括号的最右边
*/ 

package com.meego.cainiao.method;
public class VarargsDemo {
    static double  sumvarargs(double a,int... intArrays){
        int i;
        double sum=a;
        for(i=0; i< intArrays.length; i++) {
            sum += intArrays[i];
        }
        return(sum);
    }

	public static void main(String[] args) {

        double sum = sumvarargs(11.11,new int[]{10,12,33});
        System.out.println("数字相加之和为: " + sum);
    }
}

