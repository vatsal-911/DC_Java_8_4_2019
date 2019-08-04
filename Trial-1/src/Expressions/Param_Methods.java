package Expressions;

public class Param_Methods {
	
	public void method() {
		System.out.println("I am Default Method!");
		this.method1(1);
	}
	public void method1(int a) {
		System.out.println("I am ONE parameterised method!");
		this.method3(1, 2, 3);
	}
	public void method2(int a, int b) {
		System.out.println("I am TWO parameterised Method!");
		this.method();
	}
	public void method3(int a, int b, int c) {
		System.out.println("I am THREE parameterised Method!");
         
	}
	
	public static void main(String[] args) {
		System.out.println("Output is as follows:");
		Param_Methods pm=new Param_Methods();
		pm.method2(1, 2);
	}

}
