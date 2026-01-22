package lab6;

import java.util.Scanner;

public class Q06 {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i==0) sum+=i;
        }

        return sum;
    }

    public static Boolean isFriendlyPair(int a, int b) {
        return sumOfDivisors(a)/a == sumOfDivisors(b)/b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int n2 = sc.nextInt();

        System.out.println("Sum of proper divisor of "+n1+" = "+sumOfDivisors(n1));
        System.out.println("Sum of proper divisor of "+n2+" = "+sumOfDivisors(n2));

        System.out.println(n1 + " and " + n2 + (isFriendlyPair(n1, n2) ? " are" : " are not") + " a friendly pair.");

        sc.close();
    }
}
