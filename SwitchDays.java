package com.code.practice_code;

import java.util.Scanner;

public class SwitchDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter day");
		int day = sc.nextInt();
		
		switch(day)
		{
		case(1):
			System.out.println("It is Monday");
		break;
		case(2):
			System.out.println("It is Tuesday");
		break;
		case(3):
			System.out.println("It is Wednesday");
		break;
		case(4):
			System.out.println("It is Thursday");
		break;
		case(5):
			System.out.println("It is Friday");
		break;
		case(6):
			System.out.println("It is Saturday");
		break;
		case(7):
			System.out.println("It is Sunday");
		break;
		default:
			System.out.println("Not entered correct day");
		}
	}

}
