package lec;
import java.util.*;
public class SortNum {

    public static int[] unpackInt(int num) {
        int digits =  (int) Math.log10(num) + 1;
        int[] arr = new int[digits];
        for (int i=digits-1; i>=0; i--) {
            int d = num%10;
            arr[i] = d;
            num/=10;
        }
        return arr;
    }

    public static int[] sortArr(int [] arr) {
        for (int i = 0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int packInt(int[] arr) {
        int num = 0;
        for (int x : arr) {
            num = num*10 + x;
            //System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 4321;
        int[] arr = unpackInt(n);
        arr = sortArr(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(packInt(arr));
    }
}
