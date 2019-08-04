package Expressions;

public class Patterni {

	public void Pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j >= i*j; j++) {
				System.out.println("X");
				
			}
			
		}
	}
	public static void main(String[] args) {
		Patterni p=new Patterni();
		p.Pattern();
	}
}
