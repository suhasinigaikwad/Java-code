package com.code.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingwithTrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first no: ");
		int a = sc.nextInt();
		
		System.out.println("enter second no: ");
		int b = sc.nextInt();
	
		try {	
		
		int div = a/b;
		System.out.println("division is: "+div);
		}
		
		catch(Exception e) {
			System.out.println("exception is: "+e);
			
		}
		//final: final is keyword that used for immutability and restriction in variable,method & class
		
		//finally: this block is used in excpetion handling to ensure that certain 
		//         piece of code is always execute whether an exception occur or not
		
		//finalize: is method of object class,used for cleanup before garbage collection
		
		finally {
			System.out.println("finally block is always executed");
		}
		
		
		System.out.println("----------------------------------------");
		System.out.println("using final keyword");
		int x=10;
		x++;
		final int y=20;//constant value
		//if try to modify value it gives compile time error
		//y++;
		
		
	
		int add = x+y;
		System.out.println("addition is: "+add);
		
		
	}

}
