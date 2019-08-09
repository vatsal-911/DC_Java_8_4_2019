package Expressions;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args) 
{
	int n;
	int rem; 
	int rev=0;
	System.out.println("Input a number");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int old=n;
	s.close();
	System.out.println("Palindrome Test running . . .");
	while (n!=0) 
	{
		rem = n%10;
		rev = (rev*10) +rem;
		n=n/10;
		
	}
	//System.out.println(+rev);
	if(old==rev) 
	{
		System.out.println("This is a Palindrome number");
	}
	else 
	{
		System.out.println("This is not a Palindrome number");
	}
}
}
