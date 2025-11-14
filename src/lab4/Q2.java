package lab4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		String ruler = "";
		
		for (int i=1; i<num+1; i++) {
			ruler = ruler + i +ruler;
			System.out.println(ruler);
			
		}

		sc.close();
		
	}

}
