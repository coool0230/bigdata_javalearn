/**
* Filename : Practice2.java
* Author : huyn
* Creation time : 下午4:09:54 - 2018年5月20日
* Description :
*/
package com.chapterfour.com;
public class Practice2 {
public static void main(String[] args){
    {  
        //菱形上半部分  
        for(int i=1;i<=10;i++)  
        {  
            //上半部分空格循环  
            for(int j=10;j>=i;j--)  
            {  
                System.out.print(" ");  
            }  
            //上半部分菱形循环  
            for(int k=1;k<i*2;k++)  
            {  
                System.out.print("*");  
            }  
                System.out.println();  
            }  
                  
        //菱形下半部分  
        for(int l=1;l<10;l++)  
        {  
            //下半部分空格循环  
            for(int m=0;m<=l;m++)  
            {  
                System.out.print(" ");  
            }  
            //下半部分菱形循环  
            for(int n=19;n>l*2;n--)  
            {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
    }  
    
}
}