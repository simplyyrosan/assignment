package lab3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int n3 = sc.nextInt();
		
		if ((n1>n2) && (n2>n3)) {
			System.out.println("Decreasing");
		} else if ((n1<n2) && (n2<n3)) {
			System.out.println("Increasing");
		} else {
			System.out.println("Neither Increasing nor Decreasing");
		}

		sc.close();
	}

}
