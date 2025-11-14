package lab4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number between 1 and 10! ");

		
		int num = 1 + (int) (Math.random()*10);
		int guess;
		do {
			
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			
			if (guess>num) {
				System.out.println("Too high, try again.");
			} else if (guess<num) {
				System.out.println("Too low, try again.");
			}
		} while (guess!=num);
		
		System.out.println("Good guess!");

		sc.close();
	}

}
