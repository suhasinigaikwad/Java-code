package com.code.oops_code;

interface Father{
	 abstract void msg1();
	 
	 void display();
}

interface Mother{
	 abstract void msg2();
	 
	 void display();
}

class Child implements Father,Mother{

	@Override
	public void msg1() {
		System.out.println("this is father method");
		
	}

	@Override
	public void msg2() {
		System.out.println("this is mother method");
		
	}

	@Override
	public void display() {
		System.out.println("override method");
		
	}
	
}



public class MultipleInheritanceUsingInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.msg1();
		c.msg2();
		c.display();
	}

}
