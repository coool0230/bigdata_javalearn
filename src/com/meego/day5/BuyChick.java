/**
* Filename : BuyChick.java
* Author : huyn
* Creation time : ����8:20:37 - 2018��12��23��
* Description :
* ��Ǯ��ټ�
* ���� :5/ֻ
* ĸ��: 3/ֻ
* С��:1/3ֻ
* 100 ��100ֻ��
*/
package com.meego.day5;
public class BuyChick {
	public static void main(String[] args){
		//�����Ϊ����
		for(int i = 0;i< 100/5;i++){
			for(int j = 0;j < 100/3;j ++){
				for(int k = 0;k < 100;k = k + 3){
					int money = i *5 + j * 3 + (k/3);
					int count = i + j +k ;
					while(money == 100 && count ==100){
						System.out.print("���� " + i +"ֻ" +"  "  +"ĸ�� " + j +"ֻ" +"  " + "С�� " + k +"ֻ" );
						System.out.println();
						break;
					}
					
				}
				
			}
		}
	}

}
