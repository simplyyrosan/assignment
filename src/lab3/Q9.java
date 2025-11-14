package lab3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter operator (+, -, *, /): ");
		char op = sc.next().charAt(0);
		
		switch (op) {
			case '+':
				System.out.println("Result: "+ (n1+n2));
				break;
			case '-':
				System.out.println("Result: "+ (n1-n2));
				break;
			case '*':
				System.out.println("Result: "+ (n1*n2));
				break;
			case '/':
				if (n2==0) {
					System.out.println("Error: Divison by zero is not allowed!");
				} else {
					System.out.println("Result: "+ (n1/n2));
				}
				break;
			default:
				System.out.println("Invalid operator! Please use +, -, * or /.");
		}
		
        sc.close();
		}

}
