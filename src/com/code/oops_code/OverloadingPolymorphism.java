package com.code.oops_code;

/*class AdditionOfTwo{
	void sum(int a,int b) {
		int i = a+b;
		System.out.println("addition of two no is: "+i);
	}


	void sum(int a,int b,int c) {
		int i = a+b+c;
		System.out.println("addition of three no is: "+i);
	}

	void sum(double a,double b) {
		double i = a+b;
		System.out.println("addition of two double no is: "+i);
	}
}
public class OverloadingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AdditionOfTwo add1 = new AdditionOfTwo();
add1.sum(10, 20);
add1.sum(10, 20, 30);
add1.sum(1.0, 2.0);
	}

}*/

//overloading polymorphism program using return 
class AdditionOfTwo{
	 int sum(int a,long b) {
		return (int) (a+b); //typecast
		
	}


 int sum(int a,int b,double c) {
		return (int) (a+b+c);
	
	}

	double sum(double a,double b) {
		return a+b;
		
	}
}
public class OverloadingPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AdditionOfTwo add1 = new AdditionOfTwo();
//add1.sum(10, 20);
int result1 = add1.sum(10, 20);
System.out.println("addition of two no is: "+result1);
//add1.sum(10, 20, 30);
int result2 =add1.sum(10, 20, 30);
System.out.println("addition of three no is: "+result2);
//add1.sum(1.0, 2.0);
double result3 = add1.sum(1.0, 2.0);
System.out.println("addition of two double no is: "+result3);
	}

}

