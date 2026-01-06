package lab3;

import java.util.Scanner;

public class Q12c {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b, c: ");      

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = (a>=b ? ( a>=c ? a : c) : ( b>=c ? b : c));

        System.out.println("Largest number: "+res);

        sc.close();
    }

}
