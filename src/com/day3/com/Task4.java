/**
* Filename : Task4.java
* Author : huyn
* Creation time : 下午5:19:48 - 2018年12月22日
* Description :输出整数的二进制表达方式,没做判断,目前输入大于64的整数,输出结果准确
*/
package com.day3.com;
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
