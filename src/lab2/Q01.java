package lab2;
import java.util.*;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (9.0/5)*celsius + 32;
		
		System.out.println(celsius + " Celsius is "+ fahrenheit +" Fahrenheit");
		
		sc.close();
	}

}
