package ITER;

import java.lang.Math;

public class Q7 {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;

        int sum = die1 + die2;

        System.out.println("First die: " + die1 + " \nSecond die: " + die2 + " \nSum: " + sum);
    }
}
