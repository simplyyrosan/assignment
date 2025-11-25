package lab4;
import java.util.Scanner;

public class Q1 {

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
		
		if (sum%9==0) {
			System.out.println("The number "+ num + " is Divisible by 9.");
		} else {
			System.out.println("The number "+ num + " is not Divisible by 9.");
		}

		sc.close();
	}

}

