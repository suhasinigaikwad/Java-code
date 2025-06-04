package com.code.oops_code;

class StaticPolymorphism {

	void addition() {

		int a = 10, b = 20;

		int c = a + b;

		System.out.println("Addition of hard coded Numbers -" + c);

	}
	
	void addition(int a,int b) {

		int x = a;
		int y = b;

		int c = x + y;

		System.out.println("Addition of 2 int Numbers -" + c);

	}
	
	

	void addition(double a, double b) {

		double x = a;
		double y = b;

		double c = x + y;

		System.out.println("Addition of 2 double Numbers -" + c);

	}

	void addition(int a, int b, int c) {

		int x = a;
		int y = b;
		int z = c;

		int add = x + y + z;

		System.out.println("Addition of 3 int Numbers -" + add);

	}

	public static void main(String args[]) {

		StaticPolymorphism cal = new StaticPolymorphism();

		cal.addition();
		cal.addition(10, 20);
		cal.addition(100, 200, 300);
		cal.addition(100.20, 200.30);

	}

}
