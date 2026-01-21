package lec;
import java.util.*;

public class lec13 {
    public static int[] removeDup(int[] arr) {
        int[] res = new int[arr.length];
        int pos = 0;
        for (int i=0; i<arr.length; i++) {
            boolean found = false;
            for (int j=0; j<arr.length; j++) {
                
                if (arr[i]==res[j]) found = true;
                
            }
            if (!found) res[pos++]=arr[i];
        }
        int[] dup = new int[pos];
        for (int i=0; i<pos; i++) {
            dup[i] = res[i];
        }
        return dup;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 1};
        arr = removeDup(arr);
        System.out.println(Arrays.toString(arr));
    }
}
