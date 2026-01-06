package lab5;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter x : ");
		double x = SC.nextInt();
		double sinx = 0.0 , fact = 1.0 , numerator = 0.0 ;
		int sign = 1;
		for (int n = 1 ; ; n+=2) {
			numerator = Math.pow(x, n);
			fact = 1;
			for (int j = 1; j<=n; j++) {
				fact *= j;
			}
			double sum= (sign * (numerator / fact ));
			if (Math.abs(sum)<1e-6) 
				break;
			sinx += sum;
			sign *=-1;
		}
		System.out.println("Sin("+ (int)x +") : "+sinx);
		SC.close();
	}
}
