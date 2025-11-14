package lab3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double a, b, c;
		System.out.print("Enter a, b, c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double des = (b*b - 4*a*c);
		
		if (des<0) {
			System.out.println("No real roots");
		} else if (des==0) {
			double r = (-b/(2*a));
			System.out.println("The equation has one root "+ r);
		} else if (des>0) {
			double r1 = ((-b + Math.pow(des, 0.5))/(2*a));
			double r2 = ((-b - Math.pow(des, 0.5))/(2*a));
			System.out.println("The equation has two roots "+r1+" "+r2);
		}

		sc.close();
	}

}
