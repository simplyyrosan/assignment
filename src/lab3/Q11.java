package lab3;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int n = sc.nextInt();

        boolean res1 = (n%5==0) && (n%6==0);
        boolean res2 = (n%5==0) || (n%6==0);
        boolean res3 = ((n%5==0) || (n%6==0)) && !(n%5==0) && (n%6==0);

        System.out.println("Is 10 divisible by 5 and 6? "+res1);
        System.out.println("Is 10 divisible by 5 or 6? "+res2);
        System.out.println("Is 10 divisible by 5 or 6, but not both? "+res3);

        sc.close();
    }
}
