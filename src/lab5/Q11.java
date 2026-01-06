package lab5;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int n2 = sc.nextInt();
        System.out.print("Prime numbers between "+n1+" and "+n2+" are: ");
        for (int i = n1; i<=n2; i++) {
            boolean flag = true;
            for (int j = 2; j< i/2+1; j++) {
                if (i%j==0)
                    flag = false;
            }
            if (flag)
                System.out.print(i + " ");
        } 
        sc.close();
    }
}

/* 
Cool knowledge:
    You can use "Lable" to label or name a loop and use it in nested loop(inner loops) to continue or break 

    ----------------------------
    lable1:
    for (condtion1) {
        for (condition2) {
            statement1;
            continue lable1;
        }
        statement2;
    }
    ------------------------------

    ## loop structure for prime number

    outerLoop:
    for (int i = n1; i<=n2; i++) {
        for (int j = 2; j< i/2+1; j++) {
            if (i%j==0)
                continue outerLoop;
        }

        System.out.println(i + " ");
    } 

 */