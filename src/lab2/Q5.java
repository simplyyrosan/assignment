package lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		double x1 ,y1 ,x2, y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("The distance betweem two points is " + distance);

		sc.close();

	}

}

