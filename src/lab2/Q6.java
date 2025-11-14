package lab2;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		double x1, x2, x3, y1, y2, y3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three points for a triangle:  ");
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		double s = (a + b +c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of the triangle is " + area);
		
		sc.close();

	}

}



