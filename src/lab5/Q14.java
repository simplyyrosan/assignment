package lab5;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter x : ");
		double x = SC.nextInt();
		double cosx = 0.0 , fact = 1.0 , numerator = 0.0 ;
		int sign = 1;
		for (int n = 0 ; ; n++) {
			numerator = Math.pow(x, n);
			fact = 1;
			for (int j = 1; j<=n; j++) {
				fact *= j;
			}
			double sum= (sign * (numerator / fact ));
			if (Math.abs(sum)<1e-6) 
				break;
			cosx += sum;
			sign *=-1;
		}
		System.out.println("Cos("+ (int)x +") : "+cosx);
		SC.close();
	}
}
