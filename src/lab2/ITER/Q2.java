package ITER;

import java.lang.Math;
public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double res = Math.pow(a, b);
        System.out.println("Power calculator " + a + " " + b + " = " + (int)res);
    }
}