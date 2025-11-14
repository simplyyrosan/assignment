package lab4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt();
		
		System.out.println("Using for loop (1 to 3):");

		int i=1;
		for (; i<4; i++) {
			System.out.println(num+" x "+i+" "+"= " +i*num);
		}
		
		System.out.println("Using while loop (4 to 6):");
		
		while (i<=6) {
			System.out.println(num+" x "+i+" "+"= " +i*num);
			i++;
		}
		
		System.out.println("Using do-while loop (7 to 10):");
		
		do {
			System.out.println(num+" x "+i+" "+"= " +i*num);
			i++;
		} while (i<11);

		sc.close();
	}

}
