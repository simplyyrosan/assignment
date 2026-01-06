package lab6;

public class Q02 {
    public static int countDigits(int n) {
        int count = 0;
        while (n>0) {
            count++;
            n = n/10;
        }
        return count;
    }
    public static int power(int a, int b) {
        int pow = 1;
        for (int i = 0; i<b; i++) {
            pow*=a;
        }
        return pow;
    }
    public static boolean isArmstrong(int n) {
        int sum = 0, num = n;
        int count = countDigits(n);
        while (num>0) {
            int d = num%10;
            sum+= power(d, count);
            num/=10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers from 100 to 10000: ");
        int x = 0;
        for (int i = 100; i<=10000; i++) {
            if (isArmstrong(i)) {System.out.println(i); x++;} 
        }
        System.out.println("Total Armstrong Numbers Found: " + x);
    }
    
}
