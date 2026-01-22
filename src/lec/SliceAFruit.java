package lec;

/*
you have given N fruits, weight of fruit represented in array

N = [20, 40, 30, 50, 40, 20]
number of slices = 4 
slice only distinct

*/

public class SliceAFruit {
    public static void main(String[] args) {
        int[] n = {20, 40, 30, 50, 40, 20};
        int count = 0;
        for (int i = 0; i<n.length; i++) {
            for (int j=i+1; j<n.length; j++) {
                if (n[i]==n[j]) {
                    n[i] = -1;
                }
            }
        }
        for (int x : n) {
            if (x!=-1) count++;
        }
        System.out.println(count);
    }
}
