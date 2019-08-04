package Expressions;

public class P1 {

	public P1() {
		System.out.println("This is Parent default constructor");
	}
	public P1(int a, int c)
	{
		System.out.println("This is Parent Two Parameterised constructor");
	}
	public void display() {
		String s="Parent class Display method called";
		System.out.println(s);
	}
	public void display(int a) {
		System.out.println("Value of a= "+a);
	}
}
