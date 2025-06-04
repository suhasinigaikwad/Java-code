package com.code.oops_code;

  abstract class Developer1{
	void display() {     //concrete method/ non-abstract method
		System.out.println("display from developer class ");
	}
		
		void display1() {
			System.out.println("display1 from developer class");
	}
		abstract void display2(); //non-concrete method/abstract method
		
		
}
  
  //abstract ratio: 3 methods
  //1 abstract , 2 non abstract
  // 1/3= 33.33% 



 class Abstraction extends Developer1{
	 @Override 
	 void display2(){
		 System.out.println("display 2 method from child class");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction abs = new Abstraction();
		abs.display();
		abs.display1();
		abs.display2();
	}

}
