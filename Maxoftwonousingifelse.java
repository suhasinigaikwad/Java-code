package com.code.practice_code;

import java.util.Scanner;

public class Maxoftwonousingifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter first no: ");
		a = sc.nextInt();
		
		System.out.println("enter second no : ");
		b= sc.nextInt();
		
		if(a>b) {
		System.out.println("Max no is first: "+a);
		}
		else {
		System.out.println("Max no is second : "+b);
	}
	}

}
