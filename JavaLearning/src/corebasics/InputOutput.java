package corebasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputOutput {

	public static void inpoutp() throws IOException {
		System.out.println("whenver user want to pass a string form run time we use readline function ");
		System.out.println("whenver user want to pass a integer form run time we use read function which dont return integer but returns the ASCII Value  ");
		System.out.println("enter a integer to get ASCII value");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int inte= (br.read());
		System.out.println("ASCII Value from entered value is   "  +inte);
	}

	
	public static void inpoutp2() throws IOException {
		System.out.println("whenver user want to pass a string form run time we use readline function ");
		System.out.println("whenver user want to pass a integer form run time we use read function which dont return integer but returns the ASCII Value  ");
		System.out.println("enter a integer to get ASCII value");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String inte= (br.readLine());
		System.out.println("String Value from entered value is   "  +inte);
	}
	
	
	

	public static void inpoutp3() throws IOException {
		System.out.println("whenver user want to pass a string form run time we use readline function ");
		System.out.println("whenver user want to pass a string form run time we use read function which returns the String value");
		System.out.println("enter a String to get String value");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));	
		String ite= (br.readLine());
		System.out.println("Enter String is " + ite);	
		double dub = (br.read());
		System.out.println("The double value"  + dub);
		char rte= (char) (br.read());		
		System.out.println("Character is printing cause we have casted the integer to character   " +rte);

	}
	

	public static void inpoutp4() throws IOException {

		System.out.println("to break the string in to number of pieces that is called tokens");
		
		
		System.out.println("we can use a class called Stringtokenizer ");
			
		StringTokenizer stoken= new StringTokenizer("yogesh is cool ");
		stoken.nextToken();
		stoken.nextToken();
		stoken.nextToken();

		while (stoken.hasMoreTokens()) {
			
			System.out.println(stoken.nextToken());
			
		}
		
		
		System.out.println("came out of loop");
	
		
	}
	
	

	
	public static void inpoutpFile() throws IOException {
		File fl = new File("assign.png");
		System.out.println(fl);	
	}
	
	public static void main(String[] args) throws IOException {
		
		
		/*inpoutp();
		inpoutp2();
		inpoutp3();*/
/*		inpoutp4();
*/		
		inpoutp3();

	}
}