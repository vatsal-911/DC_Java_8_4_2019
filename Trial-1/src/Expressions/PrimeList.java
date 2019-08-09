package Expressions;

import java.util.Scanner;

public class PrimeList {
public static void main(String[] args) {
	System.out.println("Enter range start value"); 
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	System.out.println("Enter range end value");
	int b=s.nextInt();
	s.close();
	int c=0;
	System.out.println("Following are the Prime Numbers between "+a+" & "+b);
	for (int i = a; i <=b; i++) //loop from a to b 
	{
		for (int j = 1; j <= i; j++) // loop from 1 to a
		{
			if(i%j==0) // verify if j is a factor of i
			{ 
				c++;   // increase count by 1
			}
		
		}// End of inner loop
		if(c==2) {     // Prime numbers have only two factors - 1 & the number itself
			System.out.println(+i);
		}
		c=0;           // Reset count var for next number in the range
		
	} //End of outer loop
}
}
