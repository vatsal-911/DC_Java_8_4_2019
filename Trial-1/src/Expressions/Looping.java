package Expressions;

public class Looping {

	int Sum;
	public Looping(int a, int x) {
		Sum = a+x;
		System.out.println("value of a="+a +" & b="+x);
		System.out.println("Sum =" +Sum);
		
	}
	
	/*public int Sum1(int a, int b) {
		Sum = a+b;
		System.out.println("value of a="+a +" & b="+b);
		System.out.println("Sum =" +Sum);
		return Sum;
	}*/
	
	public void Runner() {
		System.out.println("code ran");
		for (int i = 0; i > -6; i--) 
			System.out.println("****");
		
	}
	
	
	public static void main(String[] args) {
		Looping s=new Looping(25,5); // simply running the Object creation line will call the constructor which in turn will execute the block of code that runs Sum
		//l1.Sum1(29, 1);
		s.Runner();
	
	}
}
