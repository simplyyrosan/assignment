package lab6;

import java.util.Scanner;

public class Q15 {
    public static boolean isPalindrome(String str) {
        String rev = "";
        str = str.toLowerCase();
        for (int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // if (isPalindrome(str)) System.out.println(str + "is Palindrome");
        // else System.out.println(str + "is not Palindrome");

        System.out.println(str + " is" + (isPalindrome(str)?" ":" not ") + "a Palindrome");
        sc.close();
    }
}
