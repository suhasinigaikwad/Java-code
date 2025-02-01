package com.code.practice_code;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter the number: ");
		num = sc.nextInt();
		
		
		
		if(num>0) {
		System.out.println("number is positive");
		}
		
		else if (num<0) {
			System.out.println("number is negative");
		}
		
		else
		{
			System.out.println("number is zero");
		}
				
	}

}
