package com.code.practice_code;

import java.util.Scanner;

public class Oddevenusingifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number");
		num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		
	}

}
