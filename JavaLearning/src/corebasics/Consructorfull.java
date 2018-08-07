package corebasics;

public class Consructorfull {
	
	
	
//datatype is defined
	
	int x;
	
	
	
	public Consructorfull() {   // created By user without Parameter

		System.out.println("this is calling third constructor");
	int i =45;
	System.out.println(i);
	
	}
	
	
	public Consructorfull(String a ) {   // created By user  Parameter
		
		System.out.println(a);
		
		}
	
	public Consructorfull(String n, int m ) {   // created By user  Parameter

			super();

				System.out.println("calling this statement above");
		int i =4455;
		
		System.out.println(i);
		
		
		System.out.println(n);
		}
	
	

	
	public static void main(String[] args) {
		
		System.out.println("caling a cons above");
		
		
		Consructorfull hm = new Consructorfull(); 
/*		System.out.println(hm.x);
*/		
		
		
		//  whenever we are not any consructor this is default constructor
	
	
		
		Consructorfull a1 = new Consructorfull("xcx");
		
		
		
		Consructorfull rt= new Consructorfull("this is lassi ", 34);
		
		
		
		
	
	}
}
