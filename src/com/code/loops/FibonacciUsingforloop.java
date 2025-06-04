package com.code.loops;

import java.util.Scanner;

public class FibonacciUsingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for fibonacci series: ");
		int n=sc.nextInt();
		
		int num1=0;
		int num2=1;
		
		for(int i=0;i<n;i++) {
			
			System.out.println(num1 + " ");
			int num3 = num1 +num2;
			
			num1 = num2;
	        num2 = num3;
			
		}
		
	}

}
