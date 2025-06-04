package com.code.oops_code;


class Animal1{
	String color;
	String food;
	
	Animal1(){
		
	}
	
	Animal1(String color,String food){
		this.color=color;
		this.food=food;
		
	}
	void eat() {
		System.out.println("eating");
	}
	
}

class Dog1 extends Animal1{
	String breed;
	String name;
	
	Dog1(){
	}
	
	Dog1(String breed,String name,String color,String food){
		super(color,food);
		this.breed=breed;
		this.name=name;
	
	}
	void run() {
		System.out.println("running");
	}
}

class Cat1 extends Dog1{
	String catbreed;
	String catfood;
	
	Cat1(){
		
	}
	Cat1(String catbreed,String catfood,String breed,String name,String color,String food){
		super(breed,name,color,food);
		this.catbreed=catbreed;
		this.catfood=catfood;
	}
	
	void display() {
		System.out.println("Cat breed is "+catbreed+" catfood is "+catfood+"dogbreed is:"+breed+"dog name is "+name+"color f animal is "+color+"animal food is: "+food);
	}
}
public class MultilevelusingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cat1 c = new Cat1("persion","whiskas","American","Lilly","white","fish");
	c.eat();
	c.run();
	c.display();
		
	}

}
