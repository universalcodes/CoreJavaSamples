package corebasics;

public class AllVariables {

	int i; // instance variable

	public char[] yogeshint;

	static int m; // static variable

	static String a;

	static char b;

	static long c;

	static byte d;

	static short e;

	static float f;

	static double g;

	static boolean h;
	
	static int hj;

	public static void main(String[] args) {

		int k = 1;

		AllVariables inti = new AllVariables();
		
		System.out.println(hj);

		System.out.println("Printing a instance variable" + "\n" + inti.i);

		System.out.println("Printing Local Variable & must be intialize" + "\n" + k);

		System.out.println("please find default values in variabless except local variable");

		System.out.println("Printing String directly due to static with default values" + "\n" + a);

		System.out.println("Printing Char directly due to static with default values" + "\n" + b);

		System.out.println("Printing Long directly due to static with default values" + "\n" + c);

		System.out.println("Printing byte directly due to static with default values" + "\n" + d);

		System.out.println("Printing short directly due to static with default values" + "\n" + e);

		System.out.println("Printing float directly due to static with default values" + "\n" + f);

		System.out.println("Printing double directly due to static with default values" + "\n" + g);

		System.out.println("Printing boolean due to static with default values" + "\n" + h);

		System.out.println("printing interger directly due to  static with default values" + "\n" + m);

		AllVariables av= new AllVariables();
		
		System.out.println(av.yogeshinte);
		
	}

}
