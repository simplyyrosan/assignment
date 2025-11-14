package lab3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		int a = (int) (1 + (Math.random()*9));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user number: ");
		int b = sc.nextInt();
		
		System.out.println("Computer guesses: "+a);
		
		if (a==b) {
			System.out.println("You got it right");
		} else if ((a == b+1) || (a == b-1)) {
			System.out.println("Almost got it");
		} else {
			System.out.println("You got it wrong");
		}

		sc.close();
	}

}
