package lab4;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter a number (0 to exit): ");
			num = sc.nextInt();
			
			if (num!=0) {
				String res = num%2==0 ? "Even" : "Odd";
				System.out.println(num + " is an "+ res + " number.");
			}

		} while (num!=0) ;
		
		sc.close();
	}

}
