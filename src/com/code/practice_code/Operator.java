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
		div = num2 / num1;//% will gives remainder
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
	System.out.println("RELATIONAL/COMPARISON OPERATOR:");
	
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
	
	//AND condition &:  
	//0 0 => 0       true true=>true
	//0 1 => 1			false
	//1 0 => 1			false
	//1 1 => 1			false
	
	//OR | :
	
		//0 0 => 0      	true
		//0 1 => 1			true
		//1 0 => 1			true
		//1 1 => 1			false
	System.out.println(!x); //true becomes false
	
	
	System.out.println("--------------------");
	System.out.println("shift operator:");
	System.out.println("a<<1: "+(a<<1));
	System.out.println("a>>1: "+(a>>1));
	
	
	System.out.println("---------------------------");
	System.out.println("unary operator");
	System.out.println("pre-increment: "+(++a));
	System.out.println("pre-decrementt: "+(--a));
	System.out.println("post-increment: "+(a++));
	System.out.println("post-decrementt: "+(a--));
	
	int count =1;
	count/=10; // count = count%5                      // code optimization in real project
	System.out.println(count); // 10%5 = 0
	}
	
	

}


