package Expressions;

public class Deaf {
// class created
	int a=3;
	int b=4;
	public Deaf() {
		// default constructor created
		b=a+2;
		System.out.println(b);
		System.out.println("Hello World!");
	}
	public Deaf(int a, int b) {
		// parameterized constructor created
		a=a+b;
		System.out.println(a);
		System.out.println("I am the king");
	}
public static void main(String[] args) {
	Deaf d=new Deaf(); //call to Default Constructor
	//Deaf d1=new Deaf(1,2); //call to Parameterized Constructor

}		
}
