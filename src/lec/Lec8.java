package lec;

public class Lec8 {

    public static int[] removeDups(int[] arr) {
        int count = 0;
        System.out.println(arr.length);
        int[] dups = new int[arr.length];
        
        for (int i: arr) {
            for (int j: dups) {
                if (i!=j) {
                    dups[count] = i;
                    //System.out.println(i);
                    count++;
                    break;
                }
            }
        }
        //System.out.println(count);
        int[] res = new int[count];
        for (int i=0; i<count; i++) {
            res[i] = dups[i];
        }
        return dups;
    }
    public static void main(String[] args) {
      
      
        int[] dub = {1, 1, 3, 2, 4, 3};
        int[] res = removeDups(dub);
        for (int x : res) System.out.println(x);
    }
}
