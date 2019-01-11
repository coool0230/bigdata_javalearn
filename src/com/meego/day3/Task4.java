/**
* Filename : Task4.java
* Author : huyn
* Creation time : ����5:19:48 - 2018��12��22��
* Description :��������Ķ����Ʊ�﷽ʽ,û���ж�,Ŀǰ�������64������,������׼ȷ
*/
package com.meego.day3;
public class Task4 {
	public static void main(String[] args){
		int a = 3;
		int[] res = new int[8];
		res = zeroOne(a);
		for(int i : res){
			System.out.print(i);
		}
		}

	public static int[] zeroOne(int a){
		int[] arr = new int[8];
		for(int i = 0; i < 8;i ++){
			if(a/(2 << i) == 0){
				arr[i+1] = 0;
				break;
			}
			else{
				arr[i+1] = a/(2 << i) % 2;
			}
			
		}
		
		
		return  arr;
	}
	
}
