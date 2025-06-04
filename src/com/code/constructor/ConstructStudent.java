package com.code.constructor;

	public class ConstructStudent {

		int id;
		String name;
		double fees;

		/*public ConstructStudent() // default constructor
		{
			this.id = 0;
			this.name = null;
			this.fees = 0.0;

		}*/
		public ConstructStudent() {
			
		}
		

		public ConstructStudent(int i, String string, double j) { // Parameterized Constructor

			// super();

			this.id = i;
			this.name = string;
			this.fees = j;

		}

		public ConstructStudent(ConstructStudent ref) {  // Copy Constructor
			
			this.id=ref.id;
			this.name=ref.name;
			this.fees=ref.fees;
			
			
			
			
			
		}

		private ConstructStudent(int i) {
			
			this.id=i;
			
			
		}

		public void display() {
			System.out.println(" Display mathod");
			
			
			// return 10;
		}
		


		public static void main(String[] args) {

			ConstructStudent cs = new ConstructStudent(); //default

			System.out.println(cs.id + " " + cs.name + " " + cs.fees);

			ConstructStudent cs1 = new ConstructStudent(10, "Tushar", 80000);//parameterized

			System.out.println(cs1.id + " " + cs1.name + " " + cs1.fees);
			
			ConstructStudent cs2=new ConstructStudent(cs1); // call to copy constructor
			
			//cs2=cs1;
			
			System.out.println(cs2.id + " " + cs2.name + " " + cs2.fees);
			
			
			ConstructStudent cs3= new ConstructStudent(100);
			
			
			System.out.println(" Private Constructor values, cs3 values:"+cs3.id);


			/*
			 * cs.display(); cs1.display();
			 */

		}

	}


