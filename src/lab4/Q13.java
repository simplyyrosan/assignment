package lab4;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range (N): ");
		
		int num = sc.nextInt();

        int sum = 0;

        for (int i=3; i<num; i++) {
            if (i%3==0 || i%5==0) {
                sum+=i;
            }
        }

        System.out.println("The sum of all multiples of 3 or 5 below "+ num +" is: "+sum);

        sc.close();

    }
}





