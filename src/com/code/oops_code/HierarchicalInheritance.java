package com.code.oops_code;

class Books{
	
	void Display()
	{
		System.out.println("Parent class is books");
	}
}

class Physics extends Books{
	void Display1() {
		System.out.println("physics extends from class book");
	}
}

class Chemistry extends Books{
	void Display2() {
		System.out.println("chemistry extends from class book");
	}
}
class Science extends Books{
	void Display3() {
		System.out.println("Science extends from class book");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Physics p1 = new Physics();
		p1.Display();
		p1.Display1();
		
		
		
		Chemistry c1 = new Chemistry();
		c1.Display();
		c1.Display2();
	
	
		Science s = new Science();
		s.Display();
		s.Display3();
	
	}
	


}
