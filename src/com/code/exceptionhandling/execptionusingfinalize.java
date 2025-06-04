package com.code.exceptionhandling;

class A{
	protected void  finalize() throws Throwable {
		System.out.println("finalize block called");
		super.finalize();
		//after java 9 it is deprecated
		
	}
}


public class execptionusingfinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("object created");
		a=null;
		System.gc();
		System.out.println("main methd completed");

	}

}
