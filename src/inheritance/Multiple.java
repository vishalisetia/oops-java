package inheritance;

// A simple Java program to demonstrate multiple inheritance through default methods. 
interface A 
{ 
	default void show() 
	{ 
		System.out.println("Default A"); 
	} 
} 

interface B 
{ 
	default void show() 
	{ 
		System.out.println("Default B"); 
	} 
} 

class Test implements A, B 
{ 
	// Overriding default show method 
	public void show() 
	{ 
//		System.out.println("Hello world"); 
//		or
//		A.super.show();	
//		or
		B.super.show();	
	} 
}

class Multiple {
	
	public static void main(String args[]) 
	{ 
		Test d = new Test(); 
		d.show(); 
	} 
} 
