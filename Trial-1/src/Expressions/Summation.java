package Expressions;

public class Summation {

	public int Sum(int a,int b) {
		int Sum = a+b;
		System.out.println(Sum);
		return Sum;
	}
	
	public int Div(int a, int b) {
		int Div = a/b;
		System.out.println(Div);
		return Div;
	}
	
	public static void main(String[] args) {
	Summation s=new Summation();
	//s.Sum(74, 36);
	s.Div(75, 25);
	}

}
