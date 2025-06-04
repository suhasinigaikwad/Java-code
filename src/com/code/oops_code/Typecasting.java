package com.code.oops_code;

class Addition{
	
	double sum(int a, double b) {
		double c = a+b;
		System.out.println("addition is: "+c);
		return c;
	}
}

public class Typecasting {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition add = new Addition();
		add.sum(10, 2.2);
		
		
	}

}
