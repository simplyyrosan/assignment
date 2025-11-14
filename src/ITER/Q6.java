package ITER;

import java.lang.Math;
public class Q6 {
    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));

        int mid = x + y + z - max - min;

        System.out.println("Ascending order: "+min+" "+mid+" "+max);
    }
}
