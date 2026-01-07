package ITER;

public class Q9 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = (num%10) + ((num/1000)%10);

        System.out.println("Sum of the first and last digit of " + num + " is: " + sum);
    }
}
