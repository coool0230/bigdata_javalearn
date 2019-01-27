package com.meego.day12;

import java.util.HashMap;
import java.util.Map;

public class TaskDay11_2 {

	public static void main(String[] args) {
		HashMap<Integer, String> persons = new HashMap<Integer,String>();
		HashMap<String, HashMap<Integer, String>> classes = new HashMap<String,HashMap<Integer,String>>();
//		Map<String,classes> = new HashMap<String,classes>();
		Map<String,HashMap<String,HashMap<Integer,String>>> grades = new HashMap<String,HashMap<String,HashMap<Integer,String>>>();
		for(int i =1;i <= 6;i++) {
			grades.put(i+"年级",classes);
			for(int j = 1;j <= 5;j ++) {
				grades.get(i+ "年级").put(j + "班", persons);
				for(int k = 1;k <= 30;k ++) {
					grades.get(i+ "年级").get(j + "班").put( k, "号");
					System.out.println(i+"年级"+j + "班" + k + "号");
				}
			}
		}
	}

}

class Person{
	private int no;
	private String name;
	public Person(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
}
