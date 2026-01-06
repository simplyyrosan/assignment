package lab6;

import java.util.Scanner;

public class Q16 {
    public static boolean isValidPassword(String password) {
        int len = password.length();
        if (len < 8) return false;
        int count = 0;
        for (int i=0; i<len; i++) {
            Character ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isDigit(ch)) count++;
        }
        return count>=2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String str = sc.nextLine();

        if (isValidPassword(str)) System.out.println("Valid password!!!");
        else System.out.println("Invalid password!!!");
        sc.close();
    }

}
