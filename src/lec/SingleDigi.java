package lec;

public class SingleDigi {

    public static void main(String[] args) {
        int n = 9345;
        
        int sum = 0;
        
        while (true) {
            while (n>0) {
                int d = n%10;
                sum+=d;
                n/=10;
            }
            if (sum<10) {
                break;
            } else {
                n = sum;
                sum =0;
            }
        }

    System.out.println(sum);

    }
    
}
