package lab3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int mark = sc.nextInt();
		
		int a = (int) mark/10;
		
		switch (a) {
			case 10:
				System.out.println("Grade: O");
				break;
            case 9:
                System.out.println("Grade: O ");
				break;
			case 8:
                System.out.println("Grade: A ");
				break;
			case 7:
				System.out.println("Grade: B ");
				break;
			case 6:
                System.out.println("Grade: C ");
				break;
			case 5:
                System.out.println("Grade: D ");
				break;
			case 4:
                System.out.println("Grade: F ");
				break;
			default:
				System.out.println("Failed!");
				break;
		}
		sc.close();
	}

}
