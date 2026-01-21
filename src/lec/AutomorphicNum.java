package lec;

import java.util.Scanner;

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sq = n*n;
        //System.out.println(sq);
        int sum = 0;
        int p = 1;
        while (sq>0) {
            int d = sq%10;
            sum = d*p + sum;
            p=p*10;
            sq/=10;
            System.out.println(sum + " " + sq + " " + p);
            if (sum==n) {
                System.out.println("This is an automorphic number");
                break;
            }
        }
        if (sum!=n) System.out.println("Not an automorphic number");
        sc.close();
    }
}
