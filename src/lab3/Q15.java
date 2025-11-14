package lab3;

import java.lang.Math;
import java.util.Scanner;


public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");

        int ch = sc.nextInt(); //User's choice

        int n = (int) (Math.random()*3); //Computer's choice

        String user = ch==0 ? "scissor" : ch==1 ? "rock" : ch==2 ? "paper" : "Invalid";

        String comp = n==0 ? "scissor" : n==1 ? "rock" : n==2 ? "paper" : "Invalid";

        if (user!="Invalid") {

            System.out.print("The computer is " + comp + ". ");
            System.out.print("You are " + user);

            if (ch == n) {
                System.out.print(" too. It is a draw");
            } else {
                boolean userWins = (ch == 0 && n == 2) || (ch == 1 && n == 0) || (ch == 2 && n == 1);
                if (userWins) {
                    System.out.print(". You won");
                } else {
                    System.out.print(". You lost");
                }
            }

        } else {
            System.out.println("Please choose a valid choice!");
        }

        sc.close();
    }
}
