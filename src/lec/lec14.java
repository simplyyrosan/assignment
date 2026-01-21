package lec;

import java.util.Arrays;

public class lec14 {
    public static int[] longestOrder(int[] arr) {
        int[] big = new int[arr.length];
        int[] cur = new int[arr.length];
        int pos=0;
        int b = 0;
        boolean isSeries=false;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                cur[pos++] = arr[i];
                isSeries = true;
            } else {
                if (isSeries) cur[pos++] = arr[i];
                    // if (i == arr.length-2) {      
                    //     System.out.println(arr[i+1]);        
                    //     cur[pos++] = arr[i+1]; 
                    // }
                    // else 
                isSeries = false;
                System.out.println(pos + " " + b);
                if (pos>b) {
                    System.out.println(Arrays.toString(cur));
                    big = cur;
                    cur = new int[arr.length];
                    b = pos;
                    pos = 0;
                }
            }
        }

        System.out.println(Arrays.toString(big));
        System.out.println(Arrays.toString(cur));
        System.out.println(b);
        System.out.println(pos);
        return big;
    }    

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 4, 5, 6, 1, 4, 5, 6, 7, 8, 9};
        arr = longestOrder(arr);
        System.out.println(Arrays.toString(arr));
    }
}
