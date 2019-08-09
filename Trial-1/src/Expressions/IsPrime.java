package Expressions;

import java.util.Scanner;

public class IsPrime {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int i=2;
	int c=0;
	while (i<a) 
	{
		i++;
		if(a%i==0) 
		{
		c++;
		}
	}
	if(c==1) {
		System.out.println(+a+" is a Prime number");
	}
	else {
		System.out.println(+a+" is NOT a Prime number");
	}
	s.close();
}
}
