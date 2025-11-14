package ITER;

import java.lang.Math;
public class Randomint {
	public static void main(String[] args) {
		int min = 10;
		int max = 60;
		
		int random = min+ (int) (Math.random()*(max-min+1));
		System.out.println(random);
    }
}
