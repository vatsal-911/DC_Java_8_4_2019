package Expressions;

public class Express_Assignment {
	
	public int Sum(int a, int b) {
		int c= a+b;
		return c;
		
	}
	
	public int Sub(int a, int b) {
		int c= a-b;
		return c;
	}

	public int Mul(int a, int b) {
		int c= a*b;
		return c;
	}
	
	public void Div1(int a, int b) {
		int c=a/b;
		//return c;
		System.out.println("The result of the Arithmetic expression (((((10+2)-2)*2)/2) is");
		System.out.println(c);
	}
	
	public void Div2(int a, int b) {
		int c=a/b;
		System.out.println("The result of the Arithmetic Expression (((((10-2)+2)-2)*2)/2) is");
		System.out.println(c);
	}
	
	public void Mul1(int a, int b) {
		int c=a*b;
		System.out.println("The result of the Arithmetic Expression (((((10/2)-2)+2)-2)*2)");
		System.out.println(c);
	}
	
	public int Div3(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		Express_Assignment exp=new Express_Assignment();
		//Solution of expression number 1 : (((((10+2)-2)+2)*2)/2)
		int add_res = exp.Sum(10,2);
		int sub = exp.Sub(add_res, 2);
		int new_sum = exp.Sum(sub, 2);
		int mul_res = exp.Mul(new_sum, 2);
		exp.Div1(mul_res, 2);
		
		//Solution of expression number 2 : ((((10-2)+2)-2)*2)/2)
		int sub_res = exp.Sub(10, 2);
		int sum_res = exp.Sum(sub_res, 2);
		int sub2 = exp.Sub(sum_res, 2);
		int mul = exp.Mul(sub2, 2);
	    exp.Div2(mul, 2);
	    
	  //Solution of expression number 3 : (((((10/2)-2)+2)-2)*2)
	    int div_res = exp.Div3(10,2);
	    int sub_res1 = exp.Sub(div_res, 2);
	    int sum_res1 = exp.Sum(sub_res1, 2);
	    int sub_1 = exp.Sub(sum_res1, 2);
	    exp.Mul1(sub_1, 2);
	       
	    
	}
	
	    
	    
	
}
