package com.code.switch_code;

import java.util.Scanner;

public class SwitchOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******Arithmatic operation Using Switch******");
		
		System.out.println("-----------------------------");
		
		System.out.println("Operations can be performed as: \n"+" 1)Addition\n"+" 2)subtracton\n"+ " 3)multiplication\n"+ " 4)division\n");
		
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		boolean operation = true;
		while(operation) {
		System.out.println("enter first no:");
		int num1 = sc.nextInt();
		
		System.out.println("enter second no:");
		int num2 = sc.nextInt();
		
		System.out.println("you hve entered no :"+num1+","+num2);
		
		System.out.println("-------------------------------");
		
		System.out.println("please select choice no between 1,2,3,4\n"+" 1)addition 2)subtraction 3)mutiplication 4)division");
		System.out.println("-------------------------------");
	
		
		int choice= sc.nextInt();
		
		System.out.println("you entered choice is: "+choice);
		
		System.out.println("--------------------------------");
		switch(choice) {
		case 1:
			System.out.println("Addition: " +(num1+num2));
			break;
		case 2:
			System.out.println("subtraction: " +(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication: " +(num1*num2));
			break;
		case 4:
			System.out.println("Division: " +(num1/num2));
			break;
			default:
				
				System.out.println("you have entered incorrect choice, please select between 1 to 5");

			System.out.println("-----------------------------------");
			
			System.out.println("Do you want to continue the operaton: yes/no" );

			String response = sc.next().toLowerCase();
			if(response.equals("no")) {
				operation = false;
				System.out.println("goodbye");
			}
			else {
				System.out.println("you selected to continue");
			}
			System.out.println("-----------------------------");

		}
	}

}
}
