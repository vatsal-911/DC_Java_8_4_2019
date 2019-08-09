package Expressions;

public class Fibbonacci {
public static void main(String[] args) {
	int a=0;int b=1; int sum=0;
	System.out.println("The Fibbonacci series upto 12 terms is");
	System.out.println(+a+"\n"+b);
		for (int i = 1; i <= 10; i++) {
    		sum=a+b;
    		a=b;
    		b=sum;
    		System.out.println(sum);
	}
}
}
