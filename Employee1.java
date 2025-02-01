package com.code.practice_code;

public class Employee1 {

	static String company_name= "ABC";
	int emp_id;
	String name;
	int age;
	String mobile_no;

	
	
	
	void Display() {
		System.out.println("Company name: "+company_name);
		System.out.println("Details of employee1: \n"+"Id: "+emp_id+ "\n" + "Name: " +name
				+ "\n"+"Age: "+age+"\n"+"Mobile no: "+mobile_no+ "\n");
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 emp = new Employee1();
		emp.emp_id=1;
		emp.name="Suha";
		emp.age= 28;
		emp.mobile_no = "9421941475";
		
		emp.Display();
		System.out.println("int value: "+emp.emp_id);//int value
		
		long longvar = 10000000L;
		System.out.println("long value: "+longvar);
		
		char charvar = 'A';
		System.out.println("char value: "+charvar);
		
		float floatvar = 10.5f;
		System.out.println("float value: "+floatvar);
		
		double dbvar = 5.5;
		System.out.println("double value: "+dbvar);
		
		boolean bvar = true;
		System.out.println("bolean value: "+bvar);
		
		System.out.println("string vaule: "+emp.name);
		//string value
		
		byte b= 125;
		System.out.println("byte value: "+b);
		
		short sh = 32500;
		System.out.println("short value: "+sh);
		
	}
	


}
