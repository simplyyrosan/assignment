package lab6;

import java.util.Scanner;

public class Q04 {
    public static double area(int n, double side) {
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter length of each side: ");
        double s = sc.nextDouble();
        System.out.println("Area of the regular polygon: " + area(n, s));
        sc.close();
    }
}
