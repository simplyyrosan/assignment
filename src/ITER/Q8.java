package ITER;

public class Q8 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        boolean result = (a * b >= c);

        System.out.println("Product check "+a+" "+b+" "+c+" --> "+result);
    }
}
