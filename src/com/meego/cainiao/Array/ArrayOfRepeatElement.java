/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午4:51:39 
* @Des:查找重复元素
*/ 

package com.meego.cainiao.Array;
public class ArrayOfRepeatElement {

	public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 5, 6, 6, 7, 2, 9, 2};
        findDupicateInArray(my_array);
 
    }
 
    public static void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                    System.out.println(count);;
//                    break;
                }
            }
            if(count==1)		//如果有多个重复的元素,是取的倒数第二个重复的元素
               System.out.println( "重复元素 : " +  a[j] +"    " +  j );
            count = 0;
        }
	}

}

