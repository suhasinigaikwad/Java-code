package com.code.oops_code;



class Animal{
	
	void eat() {
		System.out.println("eating");
	}
	
}

class Dog extends Animal{
	
	
	void run() {
		System.out.println("running");
	}
}

class Cat extends Dog{
	void jump() {
		System.out.println("jumping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cat c = new Cat();
	c.eat();
	c.run();
	c.jump();
		
	}

}
