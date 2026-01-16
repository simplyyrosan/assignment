package lab7;

import java.util.Scanner;

public class Q04 {
    public static double min(double[] arr) {
        double min = arr[0];
        for (double n : arr) {
            if (n<=min) min=n;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println("The minimum number is " + min(arr));
        sc.close();
    }
}
