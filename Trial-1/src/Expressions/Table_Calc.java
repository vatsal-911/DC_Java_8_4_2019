package Expressions;

public class Table_Calc {
	int base=8;
	public void TablePrint() {
		System.out.println("Table of "+base+" is as follows:-");
		for(int i=0; i<11; i++) {
			int mul=base*i;
			System.out.println(base+" x "+i+" = "+mul);		
		}
		System.out.println("End of Table of 8");
	}
	public static void main(String[] args) {
		Table_Calc t=new Table_Calc();
		t.TablePrint();
	}

}
