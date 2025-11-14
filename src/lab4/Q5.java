package lab4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		System.out.print("Enter third number: ");
		n3 = sc.nextInt();
		int sum = 0;
		
		for (int i = n1; i<n2+1; i+=n3) {
			System.out.print(i + "  ");
			sum+=i;
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+sum);

		sc.close();
	}

}
