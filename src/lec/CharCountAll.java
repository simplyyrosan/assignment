package lec;

import java.util.Scanner;

public class CharCountAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int v = 0, c = 0, d = 0, s = 0;

        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z') { // Character.isLetter(ch)
                //if (ch== 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u') // 
                if ("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;

            } else if (Character.isDigit(ch)) d++; 
            else s++;

        }

        
            System.out.println("Vowels: " + v);
            System.out.println("Consonant: " + c);
            System.out.println("Digit: "+d);
            System.out.println("Special character: "+s);
            sc.close();
    }
}
