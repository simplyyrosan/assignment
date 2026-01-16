package lab7;

import java.util.Scanner;

public class Q02 {
    public static void readInput(int[] counts) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (n >= 1 && n <= 100) {
                counts[n]++;
            }
        }
        sc.close();
    }

    public static void displayCounts(int[] counts) {
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " " + (counts[i] == 1 ? "time" : "times"));
            }
        }
    }

    public static void main(String[] args) {
        int[] counts = new int[101]; // index 1..100
        System.out.print("Enter integers between 1 and 100: ");
        readInput(counts);
        displayCounts(counts);
    }
}
