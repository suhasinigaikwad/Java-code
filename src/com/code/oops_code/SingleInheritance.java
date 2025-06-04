package com.code.oops_code;

class Vehicle{
	
	void Display() {
		System.out.println("Vehicle is parent class");
	}
}

class Car extends Vehicle{
	
	void Display1() {
		System.out.println("Car is child class extends from parent class vehicle");
	}
}


public class SingleInheritance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.Display();
		c.Display1();
	}

}
