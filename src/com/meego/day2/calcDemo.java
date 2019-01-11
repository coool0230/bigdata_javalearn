/**
* Filename : calcDemo.java
* Author : huyn
* Creation time : ����8:23:45 - 2018��12��18��
* Description :
*/
package com.meego.day2;
public class calcDemo {
	public static void main(String[] args){
		int a = +5;
		int b = -5;
		System.out.println("a=" + a+"b="+ b);
		System.out.println("a=" + (+a)+"b="+ (-b));
		// = - * /
		System.out.println(5 * 5);
		System.out.println(5 -5);
		System.out.println(5 +5);
		System.out.println("============="+((float)5/3*3));
		
		System.out.println(5%5);    //����
		
		// ++   --
		int a1 = 5,a2= 5;
		System.out.println("a1="+(a1++)); 
		System.out.println("a1="+(++a2)); 
		
		//+����������  �ַ�������
		System.out.println("a1="+"aaaa"); 
		System.out.println("5 + 5 = " +5 + 5); 
		System.out.println("5 + 5 = " +(5 + 5)); 
		
		//��ֵ���=     += -= *= /+ %=
		int a3 = 5;
		System.out.println("a3+= " +(a3+=5)); 
		
		//short
		short s = 2;
		s = (short)(s + 2);
		s+=2;
		System.out.println(s);
		
		//�Ƚ������  == <> >< !=
		System.out.println(5<=5);
		
		Object o = "hello";
		// instanceof  �ж϶����Ƿ�����Ķ���
		// instanceof �������ֻ���� ��������  class interface ����[]
		System.out.println(o instanceof String);
		System.out.println(o instanceof Object);
		//System.out.println(o instanceof int);
		System.out.println(o instanceof Class);
		
		
		//�߼������ ����˫��  ˫��
		// && || ���ڶ�·��������
		int c1 = 1,c2 = 3;
		if (c1 > 5 && c2 > 5){
			System.out.println("OK");
		}
		else{
			System.out.println("not ok");
		}
		
		//& | ! ^
		System.out.println((c1 > 5) & (c2 > 5));
		
		if ((c1>5)&(c2>5)){
			System.out.println("ok");
		}
		else{
			System.out.println("no ok");
		}
		//System.out.println(5 && 6);
		System.out.println(true && false);
		System.out.println(5 & 6);     //���4    ��λ��
		//5   0000 0101
		//6   0000 0110
		//--------------
		//4  0000  0100
		System.out.println(5 | 6); //���7      ��λ�� 
		//5   0000 0101
		//6   0000 0110
		//--------------
		//7  0000  0111
		
		System.out.println(!true); //  !��boolean����ֵȡ��
		
		//��λȡ��  ~
		System.out.println(~5);
		//5     0 0 0 0 0101   
		//-6    1  1 1 1   1010   ��λȡ��
		
		
		//���    ^   ��ͬΪ��  ��ͬΪ��
		//   0..0  0101    = 5
		// ^0..0  1100    = 12
		//-----------
		//   0..0  1001     = 9
		System.out.println(5 ^ 12);
		
		//��λ����    
		//<< ��������
		//>> ��������
		//       0000  0101 = 10
		//   000001   0100 = 40   <<2 ������λ����  ��ͬ�ڳ����ƶ�λ����2��ָ����
		System.out.println(10 << 2);
		System.out.println("6 << 2 = " + (6 << 2));
		System.out.println("-6 << 2 = " + (-6 << 2));
		// >> �з�������
		//>>> �޷������� �ճ���λ��0���
		System.out.println("-6 >>> 2 = " + (-6>>> 2));
		System.out.println("-6 >> 2 = " + (-6>> 2));
		System.out.println("-1 >> 3 = " + (-1>> 3));//-1 �з�������,һֱ��-1,��Ϊλ������1
		System.out.println("-1 >>> 3 = " + (-1>>> 3));
		
		
		//��Ԫ�����    ? : ;
		int i1 = 10;
		if (i1 < 5){
			System.out.println("<5");
		}
		else{
			System.out.println(">5");
		}
		System.out.println(i1>5?">5":"<5");
		
		int q = 5,w = 6;
		System.out.println(q>w?q:w);
		
		
		int x = 5,y = 6, z=7;
		//��Ԫ�����Ƕ��
		System.out.println(x>y?(x>z?x:z):(y>z?y:z));
		
	}

}
