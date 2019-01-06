/**
* Filename : ExceptionDemo3.java
* Author : huyn
* Creation time : 下午8:52:44 - 2018年12月27日
* Description :
*/
package com.day7.com;
public class ExceptionDemo3 {
	//子类throws,父类要不继续throws,要不try....catch
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setAge(300);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("over");
	}

}

class Person{
	private int age;
	//子类throws,父类要不继续throws,要不try....catch
	public void setAge(int age) throws AgeTooSmallException,AgeTooLargeException{
		if(age < 0){
			throw new AgeTooSmallException("输入年龄过小,不合法");
		}
		if(age > 200){
			throw new AgeTooLargeException("输入年龄过大,不合法");
		}
		this.age = age;
	}
}

class AgeTooSmallException extends Exception{
	public  AgeTooSmallException(){
		
	}
	public  AgeTooSmallException(String msg){
		super(msg);
	}
}

class AgeTooLargeException extends Exception{
	public  AgeTooLargeException(){
		
	}
	public  AgeTooLargeException(String msg){
		super(msg);
	}
}

	