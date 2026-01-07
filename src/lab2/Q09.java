package lab2;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		
		int num = sc.nextInt();
		num = (num%10) + ((num/10)%10) + ((num/100)%10);
		
		System.out.println("The sum of digits is " + num);
		sc.close();
	}

}


