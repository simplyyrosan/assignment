package lab4;

public class Q15 {
    public static void main(String[] args) {
        int sum = 0;
        int squared_sum = 0;
        for (int i=1; i<=100; i++) {
            sum+=i;
            squared_sum+=i*i;
        }
        int sum_square =  sum*sum;
        System.out.println("Sum of squares of first 100 natural numbers = " + squared_sum);
        System.out.println("Square of the sum of first 100 natural numbers = "+sum_square);
        System.out.println("Difference = "+ (sum_square-squared_sum));
    }    
}
