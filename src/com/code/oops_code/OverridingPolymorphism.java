package com.code.oops_code;

class Employees {

	  public void show() {

		System.out.println("I am an Employee");

	}

	void display1() {

		System.out.println(" I am in Employee Class");
	}

}

class TesterRunPoly extends Employees
{
	@Override
	    public void show() {
		//super.show();
	  
	  System.out.println("I am working as Test Engineer");
	  
	  }
	 

	void display2() {

		System.out.println(" I am in Tester Class");
	}
	}
	
	 class OverridingPolymorphism {


	public static void main(String args[])

	{

		// Employee ref = new Employee();

		//TesterRunPoly test = new TesterRunPoly();
		 Employees ref1 = new TesterRunPoly(); // Upcasting

		 //ref.show();
		 ref1.show();
		 
		 ref1.display1();
		 
		 //ref1.display2();
		 
		 
			
			  //test.display1(); 
			  //test.display2(); 
			  //test.show();
			 
	}

}
