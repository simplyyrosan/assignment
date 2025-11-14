package lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		
		double salary = sc.nextDouble();
		
		double da = salary*0.40;
		double hra = salary*0.20;
		
		double gross = salary + da + hra;
		
		System.out.println("DA is " + da);
		System.out.println("HRA is " + hra);
		System.out.println("Gross salary is " + gross);

		sc.close();
	}

}



