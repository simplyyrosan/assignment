package lec;

import java.util.Scanner;

public class Lec2 {
    public static boolean palidrome(int num) {
        int temp = num;
        int rev = 0;
        while (num>0) {
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        boolean res = (rev==temp);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numner: ");
        int num = sc.nextInt();
        if (palidrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
        sc.close();
    }
}
