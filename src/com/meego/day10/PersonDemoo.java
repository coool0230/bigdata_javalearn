/**
* Filename : PersonDemoo.java
* Author : huyn
* Creation time : 下午9:55:25 - 2019年1月7日
* Description :
*/
package com.meego.day10;
public class PersonDemoo {
	private String name;
	private int age;
	private boolean sex;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public PersonDemoo setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public PersonDemoo setAge(int age) {
		this.age = age;
		return this;
	}
	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public PersonDemoo setSex(boolean sex) {
		this.sex = sex;
		return this;
	}
	
}
