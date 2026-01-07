package ITER;

import java.lang.Math;

public class Q10 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5;

        n1 = Math.random();
        n2 = Math.random();
        n3 = Math.random();
        n4 = Math.random();
        n5 = Math.random();

        double avg = (n1+n2+n3+n4+n5)/5;

        double max = Math.max(Math.max(Math.max(n1, n2), Math.max(n3, n4)), n5);

        double min = Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)), n5);


        System.out.println("Random values:");
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
        System.out.println("Average value: "+avg);
        System.out.println("Minimum value: "+min);
        System.out.println("Maximum value: "+max);
    }
}


