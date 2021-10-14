package inheritance;

//A Grand parent class in diamond 
class GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Grandparent"); 
 } 
} 

//First Parent class 
class Parent1 extends GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Parent1"); 
 } 
 void funp() {
	 super.fun();
 }
} 

//Second Parent Class 
class Parent2 extends GrandParent 
{ 
 void fun() 
 { 
     System.out.println("Parent2"); 
 } 

} 

public class Hierarchical {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.funp();
	}
	


}
