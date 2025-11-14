package lab2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in km=");
		
		double km = sc.nextDouble();
		
		double m = km*1000;
		double ft = km*3280.8399;
		double inch = km*39370.0787;
		double cm = km*100000;
		
		System.out.println(km + " km is " + m + " meters");
		System.out.println(km + " km is " + ft + " feet");
		System.out.println(km + " km is " + inch + " inch");
		System.out.println(km + " km is " + (int) cm + " centimetres");

		sc.close();
	}

}


