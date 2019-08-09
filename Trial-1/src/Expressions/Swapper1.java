package Expressions;

import java.util.Scanner;

public class Swapper1 {

	public static void main(String args[]) {
		System.out.println("Enter the 1st number a= ");
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter the 2nd number b= ");
		int b = s.nextInt();
		s.close();
		int c = a; // use of third variable
		a=b;
		b=c;
		System.out.println("Now the values of a & b have been swapped");
		System.out.println("Now, the value of a is = "+a);
		System.out.println("Now, the value of b is = "+b);
		System.out.println("Thanks for watching!");
		
	}
}
