package lab5;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a = 51;
        double sum = 0;
        for (int i=1; i<n; i+=1) {
            sum = sum + a*(2.0*i/((2.0*i-1)));
            a = -a;
        }

        System.out.println(sum);
        sc.close();
    }
}
