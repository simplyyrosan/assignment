package lab4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt(), temp = num;
		
		int rev=0;
		
		while (temp>0) {
			int d = temp%10;
			rev = rev*10 + d;
			temp = temp/10;
		}
		
		System.out.println("Reversed number: "+rev);
		if (rev==num) {
			System.out.println(num+ " is a palindrome");
		} else {
			System.out.println(num+ " is NOT a palindrome");
		}

		sc.close();
	}

}
