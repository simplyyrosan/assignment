package lab2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of eggs: ");
		
		double egg = sc.nextDouble();
		
		double gross = egg/144;
		egg = egg%144;
		double dozen = egg/12;
		egg = egg%12;
		
		System.out.println("Total number of eggs is " + (int)gross +" gross, " + (int)dozen + " dozen, and "+ (int)egg+".");
		
		sc.close();
	}

}


