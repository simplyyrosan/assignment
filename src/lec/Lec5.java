package lec;

import java.util.Scanner;

public class Lec5 {

    public static void main(String[] args) {
        // counts[0] for number 1, counts[99] for number 100
        int[] counts = new int[100];

        readInput(counts);
        displayCounts(counts);

        for (int x: counts) System.out.print(x+" ");
    }

    // 1. Read input and update counts
    public static void readInput(int[] counts) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers between 1 and 100: ");
        while (true) {
            int n = input.nextInt();

            // stop when 0 is entered
            if (n == 0) {
                break;
            }

            // only count numbers in [1, 100]
            if (n >= 1 && n <= 100) {
                counts[n - 1]++;   // number n stored at index n-1
            }
        }

        input.close();
    }

    // 2. Display how many times each number appears
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            if (count > 0) {
                int number = i + 1;
                String word = (count > 1) ? "times" : "time";
                System.out.println(number + " occurs " + count + " " + word);
            }
        }
    }
}