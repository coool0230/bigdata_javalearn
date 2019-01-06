/**
* Filename : BuyChick.java
* Author : huyn
* Creation time : 下午8:20:37 - 2018年12月23日
* Description :
* 百钱买百鸡
* 公鸡 :5/只
* 母鸡: 3/只
* 小鸡:1/3只
* 100 买100只鸡
*/
package com.day5.com;
public class BuyChick {
	public static void main(String[] args){
		//最外层为公鸡
		for(int i = 0;i< 100/5;i++){
			for(int j = 0;j < 100/3;j ++){
				for(int k = 0;k < 100;k = k + 3){
					int money = i *5 + j * 3 + (k/3);
					int count = i + j +k ;
					while(money == 100 && count ==100){
						System.out.print("公鸡 " + i +"只" +"  "  +"母鸡 " + j +"只" +"  " + "小鸡 " + k +"只" );
						System.out.println();
						break;
					}
					
				}
				
			}
		}
	}

}
