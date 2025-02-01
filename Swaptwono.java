package com.code.practice_code;

import java.util.Scanner;

public class Swaptwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first no: ");
		a=sc.nextInt();
		
		System.out.println("enter second no: ");
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("------------");
		System.out.println("After swap");
		System.out.println("first no is: "+a);
		System.out.println("second no is: "+b);
		
		
		
		
	}

}
