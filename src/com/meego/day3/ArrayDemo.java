/**
* Filename : ArrayDemo.java
* Author : huyn
* Creation time : ����9:57:06 - 2018��12��20��
* Description :
*/
package com.meego.day3;
public class ArrayDemo {
	public static void main (String[] args){
		int[] arr = new int[10];
		System.out.println(arr.length);
		arr[0] = 1;
		System.out.println(arr[0]);
		
		
		//��������,��ֱ�ӳ�ʼ��
		int[]  arr2 = new int[]{1,2,3};
		System.out.println(arr2[1]);   //Խ��ʱ����ͨ�ù�,���б���ArrayIndexOutOfBoundsException,�������������߽�
		
		//û�и�����
		int [] arr3 = null;
		System.out.println(arr3 == null ? "null" :arr3.length);
		
		//ֱ�Ӹ���ֵ
		int[] arr4 = {1,2,3};
		System.out.println(arr4.length);
	}
}
