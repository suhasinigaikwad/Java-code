package com.code.practice_code;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int age;
		System.out.println("enter age");
		age = sc.nextInt();
		
		
		switch(age)
		{
		case(1):
			System.out.println("You are under 18");
		break;
		case(2):
			System.out.println("You are under 18");
		break;
		case(3):
			System.out.println("You are under 18");
		break;
		case(16):
			System.out.println("You are under 18");
		break;
		case(18):
			System.out.println("You are eligible to vote");
		break;
		
		default:
			System.out.println("enter correct age");
		break;
		
		}
				
				

	}

}
