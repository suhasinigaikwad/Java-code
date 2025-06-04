package com.code.oops_code;

interface FirstInterface{
	public static final int a = 10;
	
	public abstract void display();
	
	public abstract void display1();

	void display2();
	
	void display3(); //compiler takes as public abstract method if not given
	
	void display4();
	
	default void display5() {
		System.out.println("it display default method display5");
	}
	//only default and static method definition needs to add in interface
	
	static void display8() {
		System.out.println("it display static method display8");
	}
}

interface SecondInterface extends FirstInterface{  //interface extends interface
	
	public abstract void display6();
	
	void display7();
	
}

class Democlass implements SecondInterface{   //class implements interface
	
	@Override
	public void display() {
		System.out.println("display method is override from fistinterface class");
		
	}

	@Override
	public void display1() {
		System.out.println("display1 method is override from fistinterface class");

	}

	@Override
	public void display2() {
		System.out.println("display2 method is override from fistinterface class");

	}
	@Override
	public void display3() {
		System.out.println("display3 method is override from fistinterface class");

		
	}

	@Override
	public void display4() {
		System.out.println("display4 method is override from fistinterface class");

		
	}

	@Override
	public void display6() {
		System.out.println("display6 method is override from secondinterface class");

		
	}

	@Override
	public void display7() {
		System.out.println("display7 method is override from secondinterface class");

		
	}

	
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Democlass c = new Democlass();
		c.display();
		c.display1();
		c.display2();
		c.display3();
		c.display4();
		c.display5();
		c.display6();
		c.display7();
		FirstInterface.display8(); //ststic methd call
		System.out.println("integer value: "+c.a);
		

	}

}
