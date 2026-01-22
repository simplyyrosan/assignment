package lec;

public class MaxPrimeFac {


    public static void main(String[] args) {

        int n = 24;
        int max = 0;
        for (int i=2; i<=n; i++) {
            while (n%i==0) {
                //System.out.print(i + " ");
                if (i>max) {
                    max = i;
                }
                n = n/i;
            }
        }        

        System.out.println(max);
    }
}
