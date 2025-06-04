package com.code.oops_code;
//Multiple inheritance is not supported in java 
//we can achieve using interface

	class A{
		void display() {
			System.out.println("Class A display method");
		}
		void displayA() {
			System.out.println("class A with displayA method");
		}
	}
	
	class B{
	
		void display() {
			System.out.println("Class B display method");
			
		}
		void displayB() {
			System.out.println("class B with displayB method");
	}
		
	
	//class C extends A,B{
		//here we can use interface A,B 
		//and 
		//class C implements A,B
		
		void displayC() {
			System.out.println("class c with display c method");
		}
		
	}
	public class MultipleInheritance {

	public static void main(String[] args) {
		
	
	}

	}
	
