package lec;

import java.util.Scanner;

public class lec12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        char[] digits = num.toCharArray();
        char[] even = new char[digits.length];

        int count = 0;

        // Step 1: Store even digits in array
        for (char ch : digits) {
            int d = ch - '0';
            if (d % 2 == 0) {
                even[count++] = ch;
            }
        }

        // Step 2: Replace even digits in reverse order
        int index = count - 1;

        for (int i = 0; i < digits.length; i++) {
            int d = digits[i] - '0';
            if (d % 2 == 0) {
                digits[i] = even[index--];
            }
        }

        // Output
        System.out.println("Output: " + new String(digits));
        sc.close();
    }
}
