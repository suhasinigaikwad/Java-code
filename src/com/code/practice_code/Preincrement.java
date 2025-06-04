package com.code.practice_code;

public class Preincrement {

	public static void main(String[] args) {


		// Arithmetic operators
		
		int a = 10;
		int b = 5;
		
		System.out.println(a+b); // addition
		System.out.println(a-b); // subtraction
		System.out.println(a*b); // multiplication
		
		float result = a/b;      // division
		System.out.println(result);
		System.out.println(a%b); // modulus operator
		// modulus gives remainder 
		
		
		// palinedrome number
		
		
		
		
		
		
		
		
				
		
		// Relational/Comparison operators
		
		// > < >=, <=, == != => true/false
		
		int m = 10;
		int n = 20;
		
		
		System.out.println(m>n); // false
		System.out.println(m<n); // true
		System.out.println(m>=n); // false
		System.out.println(m<=n); // true
		System.out.println(m==n); // false
		
		// = Assignment operator
		// == Comparison operator
		
		System.out.println(m!=n);  // true
		
		
		
		
		
		
		
		
		
		
		//Logical => AND, OR NOT  && || !
		
		System.out.println("logical operators");
		
		boolean flag3 = true;
		boolean flag4 = false;
		
		// true-true/ false-true/ true-false/ false-false
		
		// true-true => true else false 
		
		System.out.println(flag3 && flag4); // 
		
		System.out.println(flag3 || flag4);
		
		// false-false => false else true
		
		
		System.out.println(!flag3); // negation 
		
		
		
		
		
		
//		Assignment Operators
//
//		= (Assign value)
		
		int myInt = 10;
		
		
		
// Increment and Decrement => Pre and Post 
		
		int count = 1; // 1, 2, 3, 4, 5 ..................
		
		System.out.println("count value : " + count); // 1
		
		count = count + 1; // 2		
		
		
		System.out.println("count value : " + count);
		
		
		count = count + 1; // 3
		
		System.out.println("count value : " + count);
		
		System.out.println("+++++++++++++++Post Increment and Decrement++++++++++++++++++");	
		
		count++; // count = count +1; - Post Increment by step 1 only
		
		System.out.println("count value : " + count);
		
		
		count--; // count = count -1; - Post Decrement by step 1 only
		
		System.out.println("count value : " + count);
		
		
	System.out.println("+++++++++++++++Pre Increment and Decrement++++++++++++++++++");	
		
		++count; // count = count +1; - Pre Increment by step 1 only
		
		System.out.println("count value : " + count);
		
		
		--count; // count = count -1; - Pre Decrement by step 1 only
		
		System.out.println("count value : " + count);
		
		
//===============================================================
		
		System.out.println("++++++++++++++++ Post vs Pre ++++++++++++++++");
		
		count = 10;
		
		// post operation is done in 2 steps => fist assign and then increment / decrement
		
		System.out.println(count++);  // count = count +1 // Post Increment // 2 step operation - init fist 
		System.out.println(count);       // increment  
		
		
		System.out.println(count--);
		System.out.println(count);
		
		
		
		
	System.out.println(" pre operation is done fist increment/decrement and assign");	
		
		count = 15;
		
		// pre operation is done fist increment/decrement and assign
		
		System.out.println(++count);  // count = count +1 // Pre Increment // 2 step operation - init fist 

		
		System.out.println(--count); 
		
		
		
		
		
		
		
		
		
		
		
		
//		+= (Add and assign)
		
		System.out.println(" +++++++++++ += (Add and assign) +++++++++");
		
		count = 20;
		
		count+=1;  // count = count + 1;
		
		System.out.println(count); // 20+1 = > 21
		
		count+=3; // count = count +3                       // code optimization in real project
		System.out.println(count); // 21 + 3 => 24  
		
		
//		-= (Subtract and assign)
		
		
		count-=20; // count = count -20                       // code optimization in real project
		System.out.println(count); // 24-20 => 4
		
		
//		*= (Multiply and assign)
		
		
		count*=5; // count = count*5                      // code optimization in real project
		System.out.println(count); // 4*5 = 20
		
		
//		/= (Divide and assign)
		
		count/=2; // count = count/2                     // code optimization in real project
		System.out.println(count); // 20/2 => 10 
		
//		%= (Modulus and assign)
		
		count%=5; // count = count%5                      // code optimization in real project
		System.out.println(count); // 10%5 = 0

		
		
		
		
		
		
		
		
		
		
//		Unary Operators
//
//		+ (Unary plus)
//		- (Unary minus)
//		++ (Increment)
//		-- (Decrement)
//		! (Logical NOT)
//		Ternary Operator
//
//		? : (Conditional operator) → condition ? expr1 : expr2

	}

}
