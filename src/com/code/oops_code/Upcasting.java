package com.code.oops_code;

class Vehicle1{
	String name= "suha";
	
	void Display() {
		System.out.println("display method from Vehicle class");
	}
}

class Bike extends Vehicle1
{
	
	void Display() { //override
		System.out.println("display method from Bike class");
	}
	
	void display1() {
		System.out.println("display1 method from Bike class");
	}
}

public class Upcasting {

	public static void main(String args[])

	{
		Vehicle1 v = new Bike(); //upcasting	
		System.out.println("name is: "+v.name);
		v.Display();
		
	
		//Bike b = new Vehicle();// downcasting not possible -compile time error- can nt cast from vehicle to bike
		Bike b = (Bike) v; //upcasting +downcasting is possible
		b.Display();
		b.display1();
		
		
	
		
	
		}
	}

