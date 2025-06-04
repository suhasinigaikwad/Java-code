package com.code.oops_code;

class GrandParent{  
	int height;
	String haircolor;
	
	GrandParent(){   
	}
	
	GrandParent(int height,String haircolor) 
	{
		this.height=height;  
		this.haircolor=haircolor; 
	}
	void display1() 
	{
		System.out.println("GrandParent height and haircolor " + height+ " and " + haircolor);
	}
}

class Parent1 extends GrandParent{  
	int weight;  
	int age;  
	
	Parent1() {   

	}
	Parent1(int weight,int age,int height,String haircolor){ 
	super(height,haircolor);	
		this.weight=weight; 
		this.age=age; 
	}
	void display2() {  
		System.out.println("weight and age is " +weight+ " and " +age);
	}
}
	
class Child1 extends Parent1{  
		String eyesColor; 
		
	Child1() {   
		this.eyesColor=null;
	}
	
	Child1(String eyesColor,int weight,int age,int height,String haircolor){ 
	super(weight,age,height,haircolor);
	this.eyesColor=eyesColor;  
	}
	
	void display3() {  
		System.out.println("eyesColor " +eyesColor);
		}
}

public class MultilevelConstruct
{
	public static void main(String[] args) { 
		
		Child1 c= new Child1("brown",65,50,150,"black"); 
		
		c.display1();
		c.display2();  
		c.display3();
	}

}


