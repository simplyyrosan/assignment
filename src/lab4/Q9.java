package lab4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int d;
		
		while (temp>0) {
			d = num%10;
			sum += d;
			temp = (int) temp/10;
		}
		
		if (sum%9==0) {
			System.out.println( num + " is Niven");
		} else {
			System.out.println(num + " is not Niven");
		}

		sc.close();
	}

}
