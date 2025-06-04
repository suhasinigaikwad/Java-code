package com.code.oops_code;

class Person {
	public String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pr = new Person();
		pr.name = "XYZ";
		pr.setAge(30);
		//p.age=18;
		System.out.println("Name of person is: "+pr.name);
		System.out.println("Age of person is: "+pr.getAge());
		
	}

}
