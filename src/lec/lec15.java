package lec;

public class lec15 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 1, 2, 4, 5, 6, 1, 4, 5, 6, 7, 8, 9};

        int start = 0, maxLen = 1;
        int currStart = 0, currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
                currStart = i;
            }

            if (currLen > maxLen) {
                maxLen = currLen;
                start = currStart;
            }
        }

        System.out.println("Longest Increasing Series:");
        for (int i = start; i < start + maxLen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
