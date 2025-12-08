package lec;

public class Lec1 {

    public static void fibo(int n) {
        int a = 0, b = 1, c;
        for (int i=1; i<=n; i++) {
            c = a+b;
            System.out.print(a+" ");
            a = b;
            b = c;
        }
    }   

    public static void main(String[] args) {
        int n = 24;
        fibo(n);
    }
}