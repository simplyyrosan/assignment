package lab3;

import java.util.Scanner;

public class Q12a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b, c: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("Largest number: "+a);
            } else {
                System.out.println("Largest number: "+c);
            }
        } else {
            if (b>c) {
                System.out.println("Largest number: "+b);
            } else {
                System.out.println("Largest number: "+c);
            }
        }

        sc.close();
    }
}
