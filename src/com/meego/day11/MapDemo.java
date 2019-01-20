package com.meego.day11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args){
		Map<MyKey,Cat> map = new HashMap<MyKey,Cat>();
		map.put(new MyKey("tom-1"), new Cat("tom-1",12));
		map.put(new MyKey("tom-2"), new Cat("tom-2",13));
		map.put(new MyKey("tom-3"), new Cat("tom-3",14));
		System.out.println("map 的size " + map.size());
		Cat c = map.get(new MyKey("tom-1"));
		System.out.println(c);
	}
}
class Cat{
	private String name;
	private int    age;
	
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
}

class MyKey{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public MyKey(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
//		System.out.println("hashcode");
		int namehash = name == null ? 0 : name.hashCode();
		int agehash = age == null ? 0 : age.intValue();
		return namehash + agehash;
	}
	
	
	public boolean equals(Object obj) {
		MyKey key0 = (MyKey)obj;
		return name.equals(key0.name) && age == key0.age;
	}
}