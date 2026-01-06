package lab6;

import java.util.Scanner;

public class Q01 {
    public static int additionSimple(int x, int y) {
        return x+y;
    }
    public static int subtractionSimple(int x, int y) {
        return x-y;
    }
    public static int multiplicationSimple(int x, int y) {
        return x*y;
    }
    public static double divisionSimple(int x, int y) {
        return x/y;
    }
    public static int remainderSimple(int n, int m) {
        return n%m;
    }
    public static double squareRootSimple(int n) {
        return Math.sqrt(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----- SIMPLE CALCULATOR -----\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder\n6. Square Root\n7. Exit");
            System.out.print("Choose an option: ");
            int ch = sc.nextInt();
            if (ch>0 && ch<6) {
                System.out.print("First number (x): ");
                int x = sc.nextInt();
                System.out.print("Second number (y): ");
                int y = sc.nextInt();
                if (ch == 1) {
                    System.out.println("Result (x+y) = " + additionSimple(x, y));
                } else if (ch == 2) {
                    System.out.println("Result (x-y) = " + subtractionSimple(x, y));
                } else if (ch == 3) {
                    System.out.println("Result (x*y) = " + multiplicationSimple(x, y));
                } else if (ch == 4) {
                    if (y != 0) {
                        System.out.println("Result (x/y) = " + divisionSimple(x, y));
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                } else if (ch == 5) {
                    System.out.println("Result (x%y) = " + remainderSimple(x, y));
                }
            } else if (ch==6) {
                System.out.print("Enter number for square root: ");
                int n = sc.nextInt();
                if (n>0)
                    System.out.println("Result = "+ squareRootSimple(n));
            } else if (ch==7) {
                System.out.println("Exiting... Thank you!");
                sc.close();
                break;
            } else {
                System.out.println("Invalid input!!! Choose again");
            }

        }
    }
}
