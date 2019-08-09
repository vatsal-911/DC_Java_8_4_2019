package Expressions;

import java.util.Scanner;

public class Facto {
public static void main(String[] args) {
	System.out.println("Enter a Number");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	System.out.println("Computed Factorial of "+a+" is:- ");
	s.close();
	int b=1;
	for (int i = a; i >= 1; i--) {
		b=b*i;
	}
	System.out.println(+b);
}
}
