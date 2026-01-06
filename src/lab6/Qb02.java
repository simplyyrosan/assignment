package lab6;

public class Qb02 {
    public static boolean isConsecutive(int n1, int n2, int n3) {
        return (n3 == n2+1) && (n3 == n1+2);
    }

    public static void main(String[] args) {
        if (isConsecutive(1, 2, 4)) System.out.println("True");
        
    }
     
}
