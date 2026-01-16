package lec;

public class Lec9 {

    // Delete a element by its value

    public static int[] deleteEle(int[] arr, int num) {
        int[] res = new int[arr.length-1];
        int i = 0;
        for (int x : arr ) {
            if (x!=num) {
                res[i++] = x;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //Example array
        arr = deleteEle(arr, 4); // We will remove 4 from example array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


