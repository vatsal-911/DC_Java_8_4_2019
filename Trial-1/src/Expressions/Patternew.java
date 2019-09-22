package Expressions;

public class Patternew {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) { //outer loop for rows
			for (int j = 1; j<=3 ; j++) { //inner loop for spaces
				System.out.print(" ");
			}
			for (int k = 1; k<=3 ; k++) {//loop to print X's on left
				System.out.print("x");
			}
			//for (int l = 0; l<=j ; l++) {//loop to print X's on right
			//	System.out.print(" ");
			}
			
		}
	}

