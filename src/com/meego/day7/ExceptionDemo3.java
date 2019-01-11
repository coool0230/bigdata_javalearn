/**
* Filename : ExceptionDemo3.java
* Author : huyn
* Creation time : ����8:52:44 - 2018��12��27��
* Description :
*/
package com.meego.day7;
public class ExceptionDemo3 {
	//����throws,����Ҫ������throws,Ҫ��try....catch
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
	//����throws,����Ҫ������throws,Ҫ��try....catch
	public void setAge(int age) throws AgeTooSmallException,AgeTooLargeException{
		if(age < 0){
			throw new AgeTooSmallException("���������С,���Ϸ�");
		}
		if(age > 200){
			throw new AgeTooLargeException("�����������,���Ϸ�");
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

	