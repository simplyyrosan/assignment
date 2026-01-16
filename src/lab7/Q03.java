package lab7;

import java.util.Scanner;

public class Q03 {
    
    public static void readArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int n = 0; n<10; n++) {
            arr[n] = sc.nextInt();
        }
    }

    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int x : arr) {
            if (x==key) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter 10 integers: ");
        readArray(arr);
        System.out.print("Enter the number to search: ");
        int k = sc.nextInt();
        System.out.println("The number "+k+" appeared "+countOccurrences(arr, k)+" time(s) in the array");
        //sc.close();
    }
}
