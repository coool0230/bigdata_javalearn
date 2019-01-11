/*
 * 	6.实现equals方法,比较四方面的要素
		Student{name,height,weight,age}
			重写equals 方法
 */

package com.meego.day10.task;

public class StudentFourEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("tom",18,173,65);
		System.out.println(s1.equals(new Student("tom",18,173,65)));
	}

}

class Student{
	private String name;
	private int age;
	private int height;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
//	public boolean equals(Student obj){
//		boolean bool = false;
//			if(!(obj.name != null && name != null)){
//				if(obj.name == name && obj.age == age && 
//						obj.height == height && 
//						obj.weight == weight) {
//					bool = true;
//				}
//			}
//			else {
//				if(obj.name == name && obj.age == age && 
//						obj.height == height && 
//						obj.weight == weight) {
//					bool = true;
//			}
//			
//		}
//			return bool;	
//	
//	}
}