/**
* Filename : FunctionDemo.java
* Author : huyn
* Creation time : ����8:37:03 - 2018��12��20��
* Description :
*/
package com.meego.day3;
public class FunctionDemo {
	public static void main(String[] args){
		message("hello world");
		int a = 1;
		int b = 2;
		//���ú���
		int c = add(a,b);
		System.out.println(c);
		System.out.println("max = " + max(1,2,4));
		System.out.println(sum(10));
		nineXNine(11);
		table99(12);
		System.out.println(fabric(5));
		int ss = fabric(6);
		System.out.println(ss);
		System.out.println(fac(15));
	}
	public static int add(int a,int b){
		int res =  a + b;
		return res;
	}
	public static void message(String msg){
		System.out.println(msg);
	}
	
	public static int max(int a,int b, int c){
		int max = a > b ? a:b ;
		max = max > c ? max :c;
		return max;
	}
	public static int sum(int a){
		int sum = 0;
		for(int i = 1; i <=a; i++){
			sum += i;
		}
		return sum;
	}
	public static void nineXNine(int a){
		int hang = 1;
//		int lie = 1;
		while(hang <= a){
			int lie = 1;
			while(lie <= hang){
				System.out.print(hang + "*" + lie + "=" + (hang*lie)+ "\t");
				lie ++;
			}
			System.out.println();
			hang ++;
		}
	}
	
	public static void table99(int row){
		for(int i = 1;i <= row;i ++){
			for(int j = 1;j <= i;j ++){
				System.out.print(j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
	}
	
	public static int fabric(int n){
		if (n <= 0){
			return -1;
		}
		else{
			int res = 1;
			for(int i = 1; i <= n;i ++){
				res = res * i;
				
			}
			return res;
		}
		
	}
	//�ݹ����׳�
	public static int fac(int n){
		if (n == 1){
			return 1;
		}
		else{
		return n * fac(n-1);
	}

	}
}
