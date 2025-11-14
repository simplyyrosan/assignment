package lab4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base: ");
		
		int b = sc.nextInt();

        System.out.print("Enter the power: ");

        int p = sc.nextInt();

        int num=1;

        for (int i=1; i<=p; i++) {
            num*=b;
        }

        System.out.println(b + " to the power "+p+ " is: "+num);

        sc.close();
    }
}
