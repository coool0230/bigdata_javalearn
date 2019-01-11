/**
* Filename : ExceptionDemo1.java
* Author : huyn
* Creation time : ����8:15:10 - 2018��12��27��
* Description :
*/
package com.meego.day7;
public class ExceptionDemo1 {
	public static void main(String[] args){
		int[] arr = {1};
//		System.out.println(arr[1]);			//Խ���쳣
//		Exception e1 = new Exception();
//		Exception e2 = new Exception("������");
		//��ӡ�쳣��Ϣ
//		System.out.println(e2.getMessage());
		//��ӡջ������Ϣ
//		e2.printStackTrace();
//		System.out.println(1/0);
		//�׳��쳣
		 test();
	}
	
	public static void test(){
		//ͨ��try catch��䴦���쳣
		try{
			throw new Exception("������!!!!!!!!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("�㶨��");
		}
	}
}
