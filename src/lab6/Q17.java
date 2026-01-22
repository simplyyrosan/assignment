package lab6;

import java.util.Scanner;

public class Q17 {
    public static Character middleChar(String str) {
        int mid = str.length()/2;
        return str.charAt(mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        System.out.println("The middle character in the string: "+middleChar(str));
        sc.close();
    }
}
