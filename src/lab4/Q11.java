package lab4;

import java.util.Scanner;

public class Q11 {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt();
        int sum = 0;

        for (int i=1; i<(num/2+1); i++) {
            if (num%i==0) {
                sum+=i;
            }
        }

        String res = num==sum ? " is" : " is not";  //Using this to terminate the if else block, makes codes small and tidy
        System.out.println(num + res + " a perfect number.");

        sc.close();
    }
}
