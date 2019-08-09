package Expressions;

import java.util.Scanner;

public class Swapper2 {
public static void main(String[] args) {
	System.out.println("Enter values for variable a = ");
	Scanner s=new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("Enter values for variable b = ");
	int b = s.nextInt();
	s.close();
	System.out.println("Let the swapping commennce!");
	a=a+b; //Swapping initiated wityhout the use of 3rd Var
	b=a-b;
	a=a-b;
	System.out.println("Now the value of a is = "+a);
	System.out.println("Now the value of b is = "+b);
}
}
