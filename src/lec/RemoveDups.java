package lec;

public class RemoveDups {

    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                result[count++] = arr[i];
            }
        }
        
        int[] finalResult = new int[count];
        for (int i = 0; i < count; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,1};
        int[] unique = removeDuplicates(arr);
        for (int x : unique) System.out.print(x + " ");

    }
}
