package lab7;
import java.util.*;

public class Q01 {
    public static int findSum(int[] arr) {
        int sum=0;
        for (int x : arr) sum+=x;
        return sum;
    }
    public static double findAverage(int[] arr) {
        return (double) findSum(arr)/arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = random.nextInt(1,100);
        }
        System.out.print("Random values stored in the array: ");
        for (int x : arr) System.out.print(x + " ");


        System.out.println("\n\nSum of the elements =" + findSum(arr));

        System.out.println("Average of the elements =" + findAverage(arr));
        sc.close();
    }
}
