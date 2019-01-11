/**
* Filename : Practice2.java
* Author : huyn
* Creation time : ����4:09:54 - 2018��5��20��
* Description :
*/
package com.meego.chapterfour;
public class Practice2 {
public static void main(String[] args){
    {  
        //�����ϰ벿��  
        for(int i=1;i<=10;i++)  
        {  
            //�ϰ벿�ֿո�ѭ��  
            for(int j=10;j>=i;j--)  
            {  
                System.out.print(" ");  
            }  
            //�ϰ벿������ѭ��  
            for(int k=1;k<i*2;k++)  
            {  
                System.out.print("*");  
            }  
                System.out.println();  
            }  
                  
        //�����°벿��  
        for(int l=1;l<10;l++)  
        {  
            //�°벿�ֿո�ѭ��  
            for(int m=0;m<=l;m++)  
            {  
                System.out.print(" ");  
            }  
            //�°벿������ѭ��  
            for(int n=19;n>l*2;n--)  
            {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
    }  
    
}
}