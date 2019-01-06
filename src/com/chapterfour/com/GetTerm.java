/**
* Filename : GetTerm.java
* Author : huyn
* Creation time : 下午2:39:46 - 2018年5月20日
* Description :
*/
package com.chapterfour.com;
public class GetTerm {
	public static void main(String[] args){
		int x = 20;
		if (x>30){
			System.out.println("a的值大于30");
		}
		else if(x > 10){
			System.out.println("a的值大于10,但小于30");
		}
		else if(x > 0){
			System.out.println("a的值大于0,但小于10");
		}
		else{
			System.out.println("a的值小于10");
		}
	}

}
