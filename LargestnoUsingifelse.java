package com.code.practice_code;

import java.util.Scanner;

public class LargestnoUsingifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first no: ");
		int a= sc.nextInt();
		
		
		System.out.println("enter second no: ");
		int b = sc.nextInt();
		
		
		System.out.println("enter third no: ");
		int c= sc.nextInt();
		
		if(a>b && b<c) {
		System.out.println("Largest no is first: "+a);
		}
		else if(b>a && b>c) {
		System.out.println("Largest no is second: "+b);
		}
		else {
		System.out.println("Largest no is third: "+c);
		}
		
		
	}

}
