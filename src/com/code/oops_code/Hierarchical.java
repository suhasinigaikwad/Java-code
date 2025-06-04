package com.code.oops_code;

class Employee{
	int id = 123;
	String name= "abc";
	void display() {
		System.out.println("Employee class is parent class");
		System.out.println("Employee details: "+id+ " "+name);
		
	}
	
}
class Developer extends Employee {
	String role="developer";
	String technology=" java";
	
	void Displaydev() {
		System.out.println("Developer class is extend from Employee class");
		
	}
	
}
class TechArch extends Employee{
	String Position="TA";
	String domain="Arch";
	
	void DisplatTA() {
		System.out.println("TestArch class is extend from Employee class");
	}
	
}
class Tester extends Employee{
	String role = "Tester";
	int Experiencelevel = 3;
	
	void DisplayTest() {
		System.out.println("Tester class is extend from Employee class");
	}
	
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developer d = new Developer();
		System.out.println("Details of develper: ");
		
		TechArch ta = new TechArch();
		System.out.println("Detailsof TechArch: ");
		
		Tester t = new Tester();
		System.out.println("Details of Tester:");
		d.display();
		d.Displaydev();
		
		
	}

}
