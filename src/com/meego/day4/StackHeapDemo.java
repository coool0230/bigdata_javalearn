/**
* Filename : StackHeapDemo.java
* Author : huyn
* Creation time : ����10:27:33 - 2018��12��22��
* Description :����� || ջ���
*/
package com.meego.day4;
public class StackHeapDemo {
	public static void main(String[] args){
//		byte[] arr = new byte[1 * 1024 * 1024 * 1024];  //1024* 1024* 1024  һ��G�ڴ���ֽ�����,��������ڶ���
		//�������з�Χ��
//		byte[] arr1 = new byte[Integer.MAX_VALUE];    //�������ֵ,  MIN_VALUE  ������Сֵ(����)
		System.out.println("ok");
//		int i = 0;
		while(true){
			out(1);
		}
	}
	public static void out(int i){
		System.out.println(i);
		out(i+ 1);							//�ݹ��Լ�,ջ���
	}
}
