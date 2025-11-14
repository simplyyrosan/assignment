package lab3;

import java.util.Scanner;

public class Q7c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();

        String isLeap = ((year%400==0) || ( (year%4==0) && (year%100!=0) ) ? " is " : " is NOT ");

        System.out.println(year + isLeap + "a leap year");
        
        sc.close();
    }
}
