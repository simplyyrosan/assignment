package lab4;

import java.util.Scanner;

public class Q8b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		
		int gcd = 1;
		
		int b = n1<n2 ? n1 : n2;
		
		for (int i=1; i<b+1; i++) {
			
			if (n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);

		sc.close();
	}

}
