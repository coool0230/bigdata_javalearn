/** 
* @author:huyn 
* @version 创建时间：2019年1月23日 上午10:57:55 
* @Des:汉诺塔问题
*/ 

package com.meego.cainiao.method;
public class hanoTower {

	public static void main(String[] args) {
        int num = 9;
        String a = "塔1";
        String b = "塔2";
        String c = "塔3";
        hano(num, a, b, c);
    }
	public static void hano(int n,String a,String b,String c) {
		if(n == 1) {
			System.out.println("碟子" + n + ":" + a + "--->" + b);
		}
		else {
			hano(n-1,a,c,b);
			System.out.println("碟子" + n + ":" + a + "--->" + b);
			hano(n-1,c,b,a);
		}
	}
}

