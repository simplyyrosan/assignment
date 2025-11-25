package lab4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int d;
		
		while (temp>0) {
			d = temp%10;
			sum += d;
			temp = temp/10;
		}

		if (num%sum==0) {
			System.out.println(num + " is Niven");
		} else {
			System.out.println(num + " is not Niven");
		}

		sc.close();
	}

}
