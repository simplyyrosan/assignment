package lab5;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); int temp = num;
        int rev = 0;
        while (temp>0) {
            int d = temp%10;
            rev = rev*10 + d;
            temp = temp/10;
        }
        int c1 = 0;
        int c2 = 0;
        for (int i=1; i<rev+1; i++) {
            if (rev%i==0) 
                c1+=1;
        }
        for (int i=1; i<num+1; i++) {
            if (num%i==0)
                c2+=1;
        }

        if (c1==2 && c2==2)
            System.out.println(num + " is a twisted prime.");
        else
            System.out.println(num + " is not a twisted prime.");

        sc.close();
    }
}