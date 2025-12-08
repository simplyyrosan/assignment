package lec;
import lec.Lec2;

public class Lec3 {
    
/*
Type 
- Static 
- Non-Static / instance method 

*/

    public static void mymethod() {
        System.out.println("This is static method");
    }
    
    public void mymethod1() {
        System.out.println("Thus is a non static method");
    }

    public static void main(String[] args) {
        Lec3 ob = new Lec3();
        Lec3.mymethod();

        ob.mymethod1();

        mymethod();

    }


}
