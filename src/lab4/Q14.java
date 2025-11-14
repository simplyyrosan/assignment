package lab4;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range (N): ");
		
		int n = sc.nextInt();

        int even_sum = 0;
        int odd_product = 1;

        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                even_sum+=i;
            } else {
                odd_product*=i;
            }
        }
        
        System.out.println("Sum of all even numbers = "+even_sum);

        System.out.println("Product of all odd numbers = "+odd_product);

        sc.close();

    }
}
