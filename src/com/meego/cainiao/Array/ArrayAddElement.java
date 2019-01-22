/** 
* @author:huyn 
* @version 创建时间：2019年1月22日 下午2:42:56 
* @Des:使用sort()方法对Java数组进行排序，及如何使用 insertElement () 方法向数组插入元素
*/ 

package com.meego.cainiao.Array;

import java.util.Arrays;

public class ArrayAddElement {

	public static void main(String[] args) {
		//数组的大小在声明时就固定
		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(arr);
	    printArray("数组排序", arr);
	    int index = Arrays.binarySearch(arr, 1);
	    System.out.println("元素 1 所在位置（负数为不存在）："+ index);  
	    int newIndex = -index - 1;
	    arr = insertElement(arr, 1, newIndex);
	    printArray("数组添加元素 1", arr);
	    arr[0]  =  10;
	    printArray("********",arr);
		
	}
	private static void printArray(String message, int array[]) {
		 System.out.println(message + ": [length: " + array.length + "]");
		      for (int i = 0; i < array.length; i++) {
		         if (i != 0){
		            System.out.print(", ");
		         }
		         System.out.print(array[i]);         
		      }
		      System.out.println();
		   }
	
	private static int[] insertElement(int original[],int element, int index) {
			      int length = original.length;
			      int destination[] = new int[length + 1];
			      //System.arraycopy(a,b,c,d),用来给数组插入元素
			      //第一个参数被复制数组,第二个参数被复制数组的开始位,第三个参数是数组元素要被复制到的新数组,第四个参数是复制几位
			      System.arraycopy(original, 0, destination, 0, index);
			      destination[index] = element;
			      System.arraycopy(original, index, destination, index + 1, length - index);
//			      System.arraycopy(original, 0, destination, 0, length);
//			      destination[index] = element;				//一次性拷贝会造成元素覆盖,而不是插入的效果
			      return destination;
			   }

}

