package lab4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt(), x=n1;
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt(), y=n2;
		
		while (y>0) {
			int temp = y;
			y = x%y;
			x = temp;
		}

		System.out.println("GCD of "+n1+ " and "+n2+" is " + x );

		sc.close();
	}

}

// 12 and 64  64%12 = 4 = x%y 
// x%y and y gcd = x and y gcd 
// 12 % 4 = 0 