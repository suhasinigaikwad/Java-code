package com.code.switch_code;

import java.util.Scanner;

public class CalculatorusingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("enter 1st no: ");
		num1 = sc.nextInt();	
		
		System.out.println("enter 2st no: ");
		num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("to perform operation(add,sub,mul,div)");
		String operation = sc.nextLine().toLowerCase();
		
		switch(operation)
		{
		case "add":
			System.out.println("addition is: "+(num1+num2));
		break;
		
		case "sub":
			System.out.println("subtraction is: "+(num1-num2));
		break;
	
		case "mul":
			System.out.println("multiplication is: "+(num1*num2));
		break;
		
		case "div":
			System.out.println("division is: "+(num1/num2));
		break;
		}
	}

}
