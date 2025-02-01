package com.code.practice_code;

public class Operator {
	
	int num1;
	int num2;
	int sum,sub,mul,div;

	int Addition() {
		sum = num1 + num2;
		return sum;
	}

	int Subtraction() {
		sub = num2 -num1;
		return sub;
	}
	
	int Multiplication() {
		mul = num1 * num2;
		return mul;
	}
	 
	int Dividion() {
		div = num2 / num1;
		return div;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operator op= new Operator();
		
		op.num1=10;
		System.out.println("Enter first no: "+op.num1);
		op.num2=20;
		System.out.println("Enter second no: "+op.num2);
		op.Addition();
		System.out.println("-------------------------");
		System.out.println(" ARITHMATIC OPERATINS:");
		System.out.println("Addition :"+op.sum);
		
		op.Subtraction();
		System.out.println("Subtraction: "+op.sub);
		
		op.Multiplication();
		System.out.println("Multipication: "+op.mul);
		
		op.Dividion();
		System.out.println("Division: "+op.div);
		
		
		System.out.println("-------------------------");
	System.out.println("RELATIONAL OPERATOR:");
	
	int a=10;
	int b=5;
	System.out.println("a==b: "+(a==b));//equals to
	System.out.println("a!=b: "+(a!=b));//not equals to
	System.out.println("a>b: "+(a>b)); //a grater than b
	System.out.println("a<b: "+(a<b)); //a less than b
	System.out.println("a>=b: "+(a>=b)); //a grater than or equal to b
	System.out.println("a<=b: "+(a<=b)); //a less than or equal to b
	
	System.out.println("-----------------------------");
	System.out.println("Logical operator");
	boolean x=true, y=false;
	System.out.println("x && y: "+(x&&y));
	System.out.println("x || y: "+(x||y));
	
	
	System.out.println("--------------------");
	System.out.println("shift operator:");
	System.out.println("a<<1: "+(a<<1));
	System.out.println("a>>1: "+(a>>1));
	
	
	}
	
	
	

}


