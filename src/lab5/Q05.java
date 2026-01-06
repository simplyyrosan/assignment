package lab5;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum1 = 0;
        for (int i=1; i<=n; i++) {
            int sum2 = 0;
            for (int j=1; j<=i; j++) {
                sum2+=j;
            }
            sum1+=sum2;
        }
        System.out.println("The sum of the series is: "+ sum1);
        sc.close();
    }
}
