package com.meego.day12;

public class TaskDay11_1 {

	public static void main(String[] args) {
		

	}

}

class Student{
	private int weight;
	private int    age;
	private int    height;
	public Student(int weight, int age, int height) {
		super();
		this.weight = weight;
		this.age = age;
		this.height = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + height;
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (height != other.height)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
}