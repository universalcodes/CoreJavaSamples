package corebasics;

public class AllMetohds {
	
	public static void smethod() {
		
		
		int i =02;  //local Variable
		
		System.out.println(i);
		
	}
	
public  void smethod1() {
		
		
		int i =033;  //local Variable
		
		System.out.println(i);
		
	}


public  void intprint() {
	
	int l=0;
	
	System.out.println(l);
}


public static int intprint1() {
	
	int l=0;
	
	System.out.println(l);
	return l;
}


public static int intprint2() {
	

	intprint1();
	
	int l=0;
	
	System.out.println(l);
	return l;
}


public  int intprint3() {
	
	int l=12;
	
	System.out.println(l);
	return l;
}




public static void main(String[] args) {
	
	smethod();
	
	
	AllMetohds  am = new AllMetohds();
	
	am.smethod1();
	
	AllVariables vm = new AllVariables();
	
	System.out.println(vm.i);
	
	
	System.out.println(vm.a);
	
	am.intprint();
	
	
	System.out.println("Calling method with static return type" + intprint1()) ;
	
	
	int  a = intprint1();
	
	System.out.println("\"Calling method with static return type storing in a integer variable" +a );

	

	am.intprint3();
	System.out.println("within static we can call only static methods");
	
	
	
	 
} 
	
	
	

}
