package ITER;

import java.lang.Math;

public class Q4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double ans = Math.cos(5*t) + Math.sin(7*t);
        String op = String.format("cos(5*"+t+") + sin(7*"+t+") = "+ans);
        System.out.println(op);
    }
}
