package Expressions;
import java.util.Scanner;
public class ExpressionSolver {
	
	public int Sum(int a, int b) {
		int sum =a+b;
		return sum;
	}
	public int Sub(int c, int d) {
		int sub =c-d;
		return sub;
	}
	public int Mul(int x, int y) {
		int multi=x*y;
		return multi;
	}
	public void Div(int e, int i) {
		int divi=e/i;
		System.out.println("The result of the Expression (((((var1+var2)-var3)+var4)*var5)/var6)");
		System.out.println(+divi);
	}

	public static void main(String[] args) {
		ExpressionSolver es=new ExpressionSolver();
		System.out.println("Enter the value of a=");//2
		Scanner scan=new Scanner(System.in);
	    int a=scan.nextInt();
		System.out.println("Enter the value of b=");//3
		int b=scan.nextInt();
		System.out.println("Enter the value of c=");//4
		int c=scan.nextInt();
		System.out.println("Enter the value of d=");//5
		int d=scan.nextInt();
		System.out.println("Enter the value of x=");//6
		int x=scan.nextInt();
		System.out.println("Enter the value of y=");//7
		int y=scan.nextInt();
		scan.close();
		/*System.out.println("Enter the value of e=");
		int e=s.nextInt();
		System.out.println("Enter the value of i=");
		int i=s.nextInt(); */
		System.out.println("OUTPUT:-");
		int sum1= es.Sum(a, b);
		int sub2= es.Sub(sum1, c);
		int sum2= es.Sum(sub2, d);
		int mul1= es.Mul(sum2, x);
		es.Div(mul1, y);
		
	}
	
}
