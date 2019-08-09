package Expressions;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	System.out.println("Enter a number");
	int n;int rem; int sum=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int old=n;
	s.close();
	while (old!=0) 
	{
		rem = old%10;
		sum= (int) (sum+Math.pow(rem, 3)); 
		old=old/10;
		
	}
	if (sum==n) {
		System.out.println("This is an Armstrong number");
	}
	else {
		System.out.println("This is not an Armstrong Number");
	}
}
}
