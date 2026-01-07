package lab3;
import java.util.*;

public class Q01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age of the person: ");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to cast your vote.");
		}
		
		sc.close();
	}
}