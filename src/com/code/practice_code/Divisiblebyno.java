package com.code.practice_code;

import java.util.Scanner;

public class Divisiblebyno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number: ");
		num = sc.nextInt();
		
		if(num%5==0) {
			System.out.println("divisible by 5");
			
		}
		else
		{
			System.out.println("not divisible by 5");
		}
	}

}
