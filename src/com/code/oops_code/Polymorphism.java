package com.code.oops_code;

class Company{
	String name = "xyz";
	String address = "pune";
	
	void displayName() {
		System.out.println("Name of company is: "+name);
	}
}

 class EmployeeChild extends Company{
	 String empname ="suha";
	 int salary = 800000;
	 
	 void displayName() {
		 System.out.println("Name of employee is: "+empname);
	 }
 }

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeChild emp = new EmployeeChild();
		emp.displayName();
	}

}
