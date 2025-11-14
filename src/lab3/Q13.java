package lab3;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-y coordinates of point: ");      

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        

        if (x==0 && y==0) {
            System.out.println(" (0.0, 0.0) is origin");
        } else if (x==0) {
            System.out.println("("+x+", "+y+") is on the y-axis");
        } else if (y==0) {
            System.out.println("("+x+", "+y+") is on the x-axis");
        } else {
            String quad = (x>0 ? ( y>0 ? "I" : "IV") : (y>0 ? "II" : "III"));
            System.out.println("("+x+", "+y+") is in quadrant "+quad);
        }

        sc.close();
    }
}