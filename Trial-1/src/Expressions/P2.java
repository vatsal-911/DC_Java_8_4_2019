package Expressions;

public class P2 extends P1 {

	public P2() {
		System.out.println("This is Child Default Constructor");
	}
	public P2(int a, int b) {
		super(1, 2);
		System.out.println("This is Child Two Parameterised Constructor");
	}
	public void display() {
		super.display();
		System.out.println("Child class Display method called");
	}
	public static void main(String[] args) {
		P2 p=new P2(1,1);
		p.display();
		p.display(2);
	}
	
}
